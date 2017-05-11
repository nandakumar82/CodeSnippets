package com.nanda.decimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 17-02-2017.
 */
public class DecToBin {

    public static void main(String[] args) {

        int input;
        List<Integer> binaryList = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to convert to binary: ");
        input = scan.nextInt();
        //System.out.println(convert(input));
        //int convert = convert(input);
        //System.out.println("Converted value is"+convert);
        convert(input/*,0*/);
        //binaryList.add(convert(input,0));
        //System.out.println(binaryList);

    }

    public static void convert(int num/*, int remainder*/) {
       // int consecutiveOnes = 0, temporaryVar = 0;
        int remainder = 0;
        if (num > 0) {
            convert(num / 2/*,  num % 2*/);
            remainder = num % 2;
           /* if (remainder == 1) {
                consecutiveOnes++;
                if (consecutiveOnes > temporaryVar) {
                    temporaryVar = consecutiveOnes;
                }

            } else {
                consecutiveOnes = 0;
            }*/
            System.out.print(remainder + " ");
            //return remainder;
        }
       // return remainder;
    }

}


