package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 20-07-2017.
 */
public class Kangaroos {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String meet = "NO";
        if((x2 > x1 && v2 > v1)){
            return meet;
        }
        for(int i=0;i<10000;i++) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2) {
                meet = "YES";
                break;
            }
        }
        return meet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
