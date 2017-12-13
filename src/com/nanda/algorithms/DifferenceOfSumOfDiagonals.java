package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by nandakumar.menon on 08-07-2017.
 */
public class DifferenceOfSumOfDiagonals {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        int sumPrimaryDiag = 0;
        int sumSecondaryDiag = 0;
        int difference = 0;
        int k = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
                if (i == j) {
                    sumPrimaryDiag += array[i][j];
                }
                //sumSecondaryDiag += array[--k][j];
            }

        }

        for(int j = 0;j<n; j++){
            sumSecondaryDiag += array[--k][j];
        }

        difference = sumSecondaryDiag - sumPrimaryDiag;

        System.out.println(Math.abs(difference));


    }
}
