package com.nanda.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Nandak on Jul, 2020
 */
public class FinMinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int count;
        //List<Integer> intList = new ArrayList();
        count = sc.nextInt();
        int[] ar = new int[count];
        for (int ar_i = 0; ar_i < count; ar_i++) {
            ar[ar_i] = sc.nextInt();
        }

        findMinimum(ar);
    }

    private static void findMinimum(int[] ar) {
        /*Arrays.sort(ar, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.equals(o2);
            }
        });*/
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[0]);
    }
}
