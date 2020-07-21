package com.nanda.hackerrank;

import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class PrintPyramidReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int depth;
        System.out.println("Enter the String : ");
        s = sc.nextLine();
        System.out.println("Enter the length : ");
        depth = sc.nextInt();
        for (int i = depth; i > 0; i--) {
            int padding = depth - i;
            if (padding > 0) {
                System.out.printf("%" + padding + "s", " ");
            }

            int m;
            int stringLength = s.length();
            for (int j = 0; j < i; j++) {
                m = j;
                if (j >= stringLength) {
                    m = j - stringLength;
                }
                System.out.printf("%c ", s.charAt(m));
            }
            System.out.println();
        }
    }
}
