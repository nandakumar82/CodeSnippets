package com.nanda.string;

/**
 * Created by Nandakumar.Menon on 24-11-2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddStringCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int count;
        char char_array[];
        String even = "";
        String odd = "";
        List evenList = new ArrayList();
        List oddList = new ArrayList();
        //String word = sc.next();
        //Fetch the number of test cases
        count = sc.nextInt();

        List<String> stringList = new ArrayList();
        for (int i = 0; i < count; i++) {
            stringList.add(sc.next());
        }
        for (String item : stringList) {
            char_array = item.toCharArray();
            for (int i = 0; i < char_array.length; i++) {
                if (i % 2 == 0) {
                    even += char_array[i];
                } else {
                    odd += char_array[i];

                }

            }
            evenList.add(even);
            oddList.add(odd);
            even = "";
            odd = "";
        }

        for (int i = 0; i < count; i++) {
            System.out.println(evenList.get(i) + " " + oddList.get(i));
        }


    }
}
