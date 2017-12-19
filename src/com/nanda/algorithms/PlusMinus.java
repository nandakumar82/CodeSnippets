package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by nandakumar.menon on 09-07-2017.
 */
public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] numbers = new int[n];
        double countPositive = 0;
        double countNegative = 0;
        double countZero = 0;


        for(int i=0;i<n;i++){
            numbers[i] = in.nextInt();
            if(numbers[i] > 0){
                countPositive++;
            }else if(numbers[i] < 0){
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.printf("%.6f %n",countPositive/n);
        System.out.printf("%.6f %n",countNegative/n);
        System.out.printf("%.6f %n",countZero/n);

    }
}
