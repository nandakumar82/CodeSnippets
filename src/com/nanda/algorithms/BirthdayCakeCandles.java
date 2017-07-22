package com.nanda.algorithms;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by nandakumar.menon on 11-07-2017.
 */
public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        SortedMap<Integer, Integer> hm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            Integer key = ar[i];
            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }
        return  hm.get(hm.lastKey());

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
