package com.nanda.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class RepeatedString {


    static long repeatedString(String s, long numberOfChars) {
        long actualSequenceLength = s.length();
        long numOfS = numberOfChars / actualSequenceLength;
        long remaining = numberOfChars % actualSequenceLength;
        long countOfASeq = 0;
        long countOfARemaining = 0;
        long totalCountNumOfS;
        String remainingSubstring = s.toUpperCase().substring(0, (int) remaining);

        for (int i = 0; i < actualSequenceLength; i++) {
            if (s.toUpperCase().charAt(i) == 'A') {
                countOfASeq++;
            }
        }

        for (int i = 0; i < remaining; i++) {
            if (remainingSubstring.charAt(i) == 'A') {
                countOfARemaining++;
            }
        }


        totalCountNumOfS = (numOfS * countOfASeq) + countOfARemaining;
        return totalCountNumOfS;

       /* int count = 0;
        Map<String, Integer> countMap = new HashMap<>();
        int stringLength = s.length();
        for (int i = 0; i < numberOfChars; i++) {
            if (i < stringLength) {
                if (s.toUpperCase().charAt(i) == 'A') {
                    countMap.put("A", ++count);
                }
            } else if (i >= stringLength) {
                if (s.toUpperCase().charAt(i - stringLength) == 'A') {
                    countMap.put("A", ++count);
                }
            }
        }
     *//*   for (int i = stringLength; i < newCharArray.length; i++) {
            newCharArray[i] = newCharArray[i - stringLength];
        }*//*
         *//* for (char character : newCharArray) {
            if (character == 'A') {
                countMap.put("A", ++count);
            }
        }*//*
        return countMap.get("A");*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);
      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }

}
