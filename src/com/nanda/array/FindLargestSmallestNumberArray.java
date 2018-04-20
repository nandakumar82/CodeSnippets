package com.nanda.array;

/**
 * Created by Nandakumar.Menon on 22-11-2016.
 */
public class FindLargestSmallestNumberArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10,1,2,8,3,15,3};
        findLargestSmallestNumberArray(arr);
    }

    private static void findLargestSmallestNumberArray(int[] arr){
        if(arr==null || arr.length < 1){
            return;
        }
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if(value < min){
                min = value;
            }
            if(value > max){
                max = value;
            }
        }
        System.out.println("Minimum element :"+min);
        System.out.println("Maximum element :"+max);
    }
}

