package com.nanda.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class JumpingTheClouds {
    static int jumpingOnClouds(int[] c) {
        int arrayLength = c.length;
        int i = 0;
        int jumpStep = 0;
        while (i < arrayLength - 1) {
            if ((i != arrayLength - 2) && c[i + 1] == 0 && c[i + 2] == 0) {
                i = i + 2;
                jumpStep++;
            } else if (c[i + 1] == 0) {
                i++;
                jumpStep++;
            } else if (c[i + 1] == 1) {
                i = i + 2;
                jumpStep++;
            }
        }
        return jumpStep;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
}
