package com.nanda.threads.latestproducerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by nandakumar.menon on 16-04-2017.
 */
public class ProducerConsumerProblem
{
    public static void main(String[] args) throws InterruptedException
    {
        int numProducers = 4;
        int numConsumers = 3;

        BlockingQueue<Object> myQueue = new LinkedBlockingQueue<>(20);

        for (int i = 0; i < numProducers; i++){
            new Thread(new Producer(myQueue)).start();
        }

        for (int i = 0; i < numConsumers; i++){
            new Thread(new Consumer(myQueue)).start();
        }

        // Let the simulation run for, say, 10 seconds
        Thread.sleep(10 * 10000);

        // End of simulation - shut down gracefully
        System.exit(0);
    }
}
