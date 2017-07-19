package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by nandakumar.menon on 09-07-2017.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //char c = '#';
        for(int i=0 ; i<n ;i++){
            for(int j = 0; j <= n-i-2; j++){
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
