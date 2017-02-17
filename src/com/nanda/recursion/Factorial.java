package com.nanda.recursion;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 17-02-2017.
 */
public class Factorial {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(factorial(value));

    }
    private static int factorial(int value){
        if(value==1)
            return 1;
        else
            return value * factorial(value-1);
    }
}
