package com.nanda.threads.traditionalproducerconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandakumar.menon on 16-04-2017.
 */
public class ProducerConsumerExampleWithWaitAndNotify
{
    public static void main(String[] args)
    {
        List<Integer> taskQueue = new ArrayList<>();
        int MAX_CAPACITY = 5;
        Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
        Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
        tProducer.start();
        tConsumer.start();
    }
}

