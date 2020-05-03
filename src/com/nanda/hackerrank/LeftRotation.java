package com.nanda.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int arrayLength = a.length;
        int[] newArray = new int[arrayLength];
        for (int i = d; i < arrayLength; i++) {
            newArray[i - d] = a[i];
        }

        for (int i = 0; i < d; i++) {
            newArray[arrayLength - d + i] = a[i];
        }

        return newArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

}
