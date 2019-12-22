package com.nanda.array;

/**
 * Created by Nandak on Nov, 2019
 */
public class MultiplicationTableRecursion {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            multiplyRecursion(i, 1);

        }
    }

    private static int multiplyRecursion(int i, int j) {
        if (j > 12) {
            System.out.println(" ");
            return 0;
        } else {
            System.out.print("\t" + i * j);
            return multiplyRecursion(i, j + 1);
        }
    }
}
