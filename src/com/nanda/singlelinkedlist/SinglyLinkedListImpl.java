package com.nanda.singlelinkedlist;


/**
 * Created by nandakumar.menon on 29-12-2016.
 */
public class SinglyLinkedListImpl<T> {


    private Node<T> head;

    public static void main(String a[]) {
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        sl.reverse();
        sl.traverse();
    }

    public void add(T element) {
        Node<T> nd = new Node<>();
        nd.setValue(element);
        System.out.println("Adding: " + element);
        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
        //since there is only one element, both head and
        //tail points to the same object.
                head = nd;
                break;
            } else if (tmp.getNextRef() == null) {
                tmp.setNextRef(nd);
                break;
            } else {
                tmp = tmp.getNextRef();
            }
        }
    }

    /**
     * Follows recursive approach
     */
   /* public Node add(Node head, T element) {
        if (head == null)
            return new Node(element);
        else if (head.getNextRef() == null) {
            head.setNextRef(new Node(element));
        } else {
            add(head.getNextRef(), element);
        }
        return head;


    }*/

    public void traverse() {

        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
                break;
            }
            System.out.print(tmp.getValue() + "\t");
            tmp = tmp.getNextRef();
        }
    }

    public void reverse() {

        System.out.println("\nreversing the linked list\n");
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while (current != null) {
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
}

class Node<T> implements Comparable<T> {
    private T value;
    private Node<T> nextRef;

    public Node(T value) {
        this.value = value;
    }

    public Node() {

    }


    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }


    public Node<T> getNextRef() {
        return nextRef;
    }


    public void setNextRef(Node<T> ref) {
        this.nextRef = ref;
    }

    @Override

    public int compareTo(T arg) {
        if (arg == this.value) {
            return 0;
        } else {
            return 1;
        }
    }
}
