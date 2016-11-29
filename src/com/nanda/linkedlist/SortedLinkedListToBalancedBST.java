package com.nanda.linkedlist;

/**
 * Created by Nandakumar.Menon on 29-11-2016.
 */
public class SortedLinkedListToBalancedBST {
    LinkedListNode head;

    public static void main(String[] args) {
        new SortedLinkedListToBalancedBST();
    }

    public SortedLinkedListToBalancedBST(){
        head = new LinkedListNode(1);
        LinkedListNode lln2 = new LinkedListNode(2);
        LinkedListNode lln3 = new LinkedListNode(3);
        LinkedListNode lln4 = new LinkedListNode(4);
        LinkedListNode lln5 = new LinkedListNode(5);
        LinkedListNode lln6 = new LinkedListNode(6);
        LinkedListNode lln7 = new LinkedListNode(7);

        head.setNext(lln2);
        lln2.setNext(lln3);
        lln3.setNext(lln4);
        lln4.setNext(lln5);
        lln5.setNext(lln6);
        lln6.setNext(lln7);

        Node balancedBSTTopDown = sortedLinkedListToBalancedBSTTopDown(head);
        printTreeInOrder(balancedBSTTopDown);

        Node balancedBSTBottomUp = sortedLinkedListToBalancedBSTBottomUp(head);
        printTreeInOrder(balancedBSTBottomUp);
    }

    private Node sortedLinkedListToBalancedBSTBottomUp(LinkedListNode list){
        int length = getLengthOfLinkedList(list);
        return sortedLinkedListToBST(length);
    }

    private Node sortedLinkedListToBST(int length){
        if(length <= 0){
            return null;
        }

        Node left = sortedLinkedListToBST(length/2);

        Node root = new Node(head.getData());
        root.setLeft(left);

        head = head.getNext();

        root.setRight(sortedLinkedListToBST(length - length/2 - 1));
        return root;
    }

    private int getLengthOfLinkedList(LinkedListNode list){
        if(list==null){
            return 0;
        }
        int count = 1;
        while((list = list.getNext()) != null){
            count++;
        }
        return count;
    }

    private Node sortedLinkedListToBalancedBSTTopDown(LinkedListNode lln){
        if(lln==null){
            return null;
        }
        if(lln.getNext()==null){
            return new Node(lln.getData());
        }

        LinkedListNode tortoise = lln;
        LinkedListNode hare = lln;
        LinkedListNode previous = null;

        while(hare!=null && hare.getNext()!=null){
            hare = hare.getNext().getNext();
            previous = tortoise;
            tortoise = tortoise.getNext();
        }

        LinkedListNode middle = tortoise;
        if(previous!=null){
            middle = previous.getNext();
            previous.setNext(null);
        }

        Node node = new Node(middle.getData());
        node.setLeft(sortedLinkedListToBalancedBSTTopDown(lln));
        node.setRight(sortedLinkedListToBalancedBSTTopDown(middle.getNext()));
        return node;
    }

    private void printTreeInOrder(Node rootNode){
        if(rootNode==null)
            return;
        printTreeInOrder(rootNode.getLeft());
        System.out.print(rootNode.getData() + " ");
        printTreeInOrder(rootNode.getRight());
    }
}

class LinkedListNode{
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}