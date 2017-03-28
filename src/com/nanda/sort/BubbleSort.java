package com.nanda.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by nandakumar.menon on 12-03-2017.
 */
public class BubbleSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int count;
        List<Integer> intList = new ArrayList();

        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            intList.add(Integer.parseInt(sc.next()));
        }

        sort(intList.toArray());


    }

    static void sort(Object[] intList) {

        int size = intList.length;
        int numberOfSwaps = 0;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - 1; j++) {
                if ((Integer) intList[j] > (Integer) intList[j + 1]) {
                    //swap((Integer)intList[j],(Integer)intList[j+1]);
                    swap(intList, j);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0)
                break;
        }
        //System.out.println("Final array after sorting " + Arrays.toString(intList));
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + intList[0]);
        System.out.println("Last Element: " + intList[intList.length - 1]);

    }

    private static void swap(Object[] intList, int position) {
        Integer temp;
        temp = (Integer) intList[position];
        intList[position] = intList[position + 1];
        intList[position + 1] = temp;
    }
}
