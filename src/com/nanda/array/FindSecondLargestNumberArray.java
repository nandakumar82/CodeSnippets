package com.nanda.array;

/**
 * Created by Nandakumar.Menon on 17-11-2016.
 */
public class FindSecondLargestNumberArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,1,5,4};
        findLargestAndSecondLargestNumberArray(arr);
    }

    private static void findLargestAndSecondLargestNumberArray(int[] arr){
        if(arr==null || arr.length < 2){
            System.out.println("Invalid Input");
            return;
        }

        int max = arr[0];
        int secondMax = arr[0];

        for (int value : arr) {
            if(value > max){
                secondMax = max;
                max = value;

            }else if(max == secondMax || (value > secondMax && value != max)){
                //value != max condition is required for [1,9,9] kind of array,
                //where secondMax is 1, but if we don't add this condition then
                //it will set secondMax not found.
                secondMax = value;
            }
        }

        if(secondMax == max){
            System.out.println("Largest number : "+max);
            System.out.println("second largest number : not found");
        }else{
            System.out.println("Largest number : "+max);
            System.out.println("second largest number :"+secondMax);
        }
    }
}

