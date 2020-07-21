package com.nanda.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class PrintPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();
        System.out.println(" ");
        String[][] arr = new String[numberOfTest][3];
        for (int i = 0; i < numberOfTest; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.next();
            }
        }
//        System.out.println(arr);
        for (int i = 0; i < numberOfTest; i++) {
            if (arr[i][2].equals("1")) {
                printUpright(arr[i][0], Integer.valueOf(arr[i][1]));
            } else if (arr[i][2].equals("-1")) {
                printDownright(arr[i][0], Integer.valueOf(arr[i][1]));
            }
        }
    }

    private static void printDownright(String s, int depth) {
        String newString = getNewString(s, depth);
        for (int i = depth - 1; i >= 0; i--) {
            addPadding(depth, i);
            printValues(newString, i);
        }
    }

    private static void printValues(String newString, int i) {
        for (int j = 0; j < i; j++) {
            System.out.printf("%c ", newString.charAt(j));
        }
        System.out.printf("%c\n", newString.charAt(i));
    }

    private static void addPadding(int depth, int i) {
        int padding = depth - i;
        if (padding > 0) {
            System.out.printf("%" + padding + "s", " ");
        }
    }

    private static void printUpright(String s, int depth) {
        String newString = getNewString(s, depth);
        for (int i = 0; i < depth; i++) {
            addPadding(depth, i);
            printValues(newString, i);
        }
    }

    private static String getNewString(String s, int depth) {
        int stringLength = s.length();
        String newString;
        char[] charArr = Arrays.copyOf(s.toCharArray(), depth);
        if (stringLength <= depth) {
            for (int i = stringLength; i < depth; i++) {
                charArr[i] = charArr[i - stringLength];
            }
        }
        newString = new String(charArr);
        return newString;
    }
}

