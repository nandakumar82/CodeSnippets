package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 19-07-2017.
 */
public class TimeConversion {

    static void timeConversion(String time) {
        // Complete this function
        String[] time_split = time.split(":");
        String hr = time_split[0];
        int hr_int = Integer.parseInt(hr);
        String ampm = time_split[2];
        String ampmc = Character.toString(ampm.charAt(2));
        if(ampmc.equals("P")&& hr_int!=12 ){
            int hr1= Integer.parseInt(hr)+12;
            hr=""+hr1;
        }else if(ampmc.equals("A")&& hr_int==12){
            hr="00";
        }
        System.out.println(hr+":"+time_split[1]+":"+Character.toString(ampm.charAt(0))
                +Character.toString(ampm.charAt(1)));

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion(s);
    }
}
