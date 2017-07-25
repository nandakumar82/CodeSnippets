package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 25-07-2017.
 */
public class DivisibleSumPairs {


    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int count = 0;
        for (int ar_i = 0; ar_i < n; ar_i++) {
            for (int ar_j = ar_i+1; ar_j < n; ar_j++) {
                if ((ar[ar_i] + ar[ar_j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
