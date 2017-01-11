package com.nanda.stack;

/**
 * Created by Nandakumar.Menon on 06-12-2016.
 */
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueApp {
    public static void main(String[] args) {
        StackUsingQueueWithOnlyOneQueue stackUsingOneQueue = new StackUsingQueueWithOnlyOneQueue();

        stackUsingOneQueue.push(10);
        stackUsingOneQueue.push(20);
        stackUsingOneQueue.push(30);
        stackUsingOneQueue.push(40);

        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();

        stackUsingOneQueue.push(50);
        stackUsingOneQueue.push(60);

        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
        stackUsingOneQueue.pop();
    }
}
class StackUsingQueueWithOnlyOneQueue{
    Queue<Integer> queue = new LinkedList<Integer>();

    public void push(int data) {
        queue.add(data);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }

    public void pop() {
        if(queue.isEmpty()){
            System.out.println("No element present");
        }else{
            System.out.println(queue.poll());
        }
    }
}