package com.nanda.decimal;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 17-02-2017.
 */
public class CountMaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char [] twoBase = Integer.toBinaryString(n).toCharArray();
        int counter = 0;
        int max=0;

        for(char nums: twoBase){
            if(nums =='1'){
                counter++;
            } else{
                counter=0;
            }
            if(max<counter)
                max = counter;
        }
        System.out.println(max);
    }
}
