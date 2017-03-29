package com.nanda.algorithms;

/**
 * Created by Nandakumar.Menon on 04-01-2017.
 *
 * Because you will not get factors from half + of a number besides the
 number itself. so the factors of a prime number will be 1 and the
 number itself. so it is only necessary to check if any factors are there
 in between 2 and the half of the number. if any its not a prime.
 */
public class MyPrimeNumCheck {

    public boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String a[]){
        MyPrimeNumCheck mpc = new MyPrimeNumCheck();
        System.out.println("Is 17 prime number? "+mpc.isPrimeNumber(17));
        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
    }
}