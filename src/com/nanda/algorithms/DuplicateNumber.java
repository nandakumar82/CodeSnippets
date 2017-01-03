package com.nanda.algorithms;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by nandakumar.menon on 02-01-2017.
 */
public class DuplicateNumber {
    /**
     *
     * f u wanna add N numbers (say 10)
     it will be like
     1+2+3+4+5+6+7+8+9+10 = 55
     10+9+8+7+6+5+4+3+2+1 = 55
     ----------------------------------------
     11+11+11+11+11+11+11+11+11+11=110 (adding vertical elements)
     -----------------------------------------
     we have the value 11 for 10 times so 10*11 = 110
     which is simplified as N*N+1 = Sum *2
     so Sum = N*(N+1)/2
     *
     *
     * @param numbers
     * @return
     */
    public int findDuplicateNumber(List<Integer> numbers){

        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }

    public int getSum(List<Integer> numbers){

        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }

    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}
