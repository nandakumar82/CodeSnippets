package com.nanda.recursion;

public class SumRecursion {

    int sum = 0;

    public int getNumberSum(int number){

        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }

    public static void main(String a[]){
        SumRecursion mns = new SumRecursion();
        System.out.println("Sum is: "+mns.getNumberSum(223));
    }
}