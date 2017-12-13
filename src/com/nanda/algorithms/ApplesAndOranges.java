package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 20-07-2017.
 */
public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //House
        int s = in.nextInt();
        int t = in.nextInt();

        int a = in.nextInt();//Position of apple tree
        int b = in.nextInt();//Position of Orange tree

        int m = in.nextInt();//no. of apples
        int n = in.nextInt();//no. of oranges
        int applesCount = 0;
        int orangesCount = 0;

        int[] appleFromHouse = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            appleFromHouse[apple_i] = in.nextInt() + a;
            if (appleFromHouse[apple_i] >= s && appleFromHouse[apple_i] <= t) {
                applesCount++;
            }
        }
        int[] orangeFromHouse = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orangeFromHouse[orange_i] = in.nextInt() + b;
            if (orangeFromHouse[orange_i] >= s && orangeFromHouse[orange_i] <= t) {
                orangesCount++;
            }
        }

        System.out.println(applesCount);
        System.out.println(orangesCount);


      /*  Arrays.stream(apple)
                .filter(x -> x + a  >= s && x + a <= t)
                .count();

        Arrays.stream(orange)
                .filter(x -> x + b  >= s && x + b <= t)
                .count();*/


    }
}
