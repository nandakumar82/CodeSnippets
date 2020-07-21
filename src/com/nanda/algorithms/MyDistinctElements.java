package com.nanda.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nandakumar.Menon on 04-01-2017.
 */
public class MyDistinctElements {

    public static void printDistinctElements(int[] arr){

        /*for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }*/
        Set<Integer> numberSet = new HashSet<>();
        for(int i : arr){
            numberSet.add(i);
        }
        numberSet.stream().map(obj -> obj + " ").forEach(System.out::print);

        numberSet.forEach(System.out::print);
    }

    public static void main(String a[]){

        int[] nums = {5,2,7,2,4,7,8,2,3};
        MyDistinctElements.printDistinctElements(nums);
    }
}
