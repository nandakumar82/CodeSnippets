package com.nanda.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] charArray = s.toUpperCase().toCharArray();
        int counter = 0;
        int valley = 0;
        int previousCounter = 0;
//        Map<> stepsCount = new HashMap<>();
        for (char step : charArray) {
            if (step == 'D') {
                previousCounter = counter;
                counter--;
            } else if (step == 'U') {
                previousCounter = counter;
                counter++;
            }
            if (counter == -1 && previousCounter == 0) {
                valley++;
            }
        }
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
