package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 22-07-2017.
 * The problem here basically asks us to find out the largest subarray sum which is less than or equal to a given value K. So the size of subarray will vary depending upon the value of K.
 * <p>
 * So the basic logic here is that we define our sliding window by two variables namely start and end. They are both initially positioned at 0. Now the end variable will keep moving one element at a time towards the end of the available list. As we keep increasing the size of our sliding window, we keep adding the elements up and we keep a check if the current window sum is > K or not.
 * <p>
 * As and when the sum becomes greater than K, we start to reduce the size of the window by incrementing the start index. We keep doing this until the window sum becomes <= K. We keep on doing this till the end variable reaches the end of the array.
 * <p>
 * Consider the following array
 * <p>
 * [1 5 3 8 2 4 2 9] and K = 10
 * <p>
 * start = 0, end = 0, sum = 1
 * start = 0, end = 1, sum = 6
 * start = 0, end = 2, sum = 9
 * start = 0, end = 3, sum = 17 > 10
 * start = 1, end = 3, sum = 16 > 10
 * start = 2, end = 3, sum = 11 > 10
 * start = 3, end = 3, sum = 8 <= 10
 * start = 3, end = 4, sum = 10
 * start = 3, end = 5, sum = 14 > 10
 * start = 4, end = 5, sum = 6 <= 10
 * start = 4, end =6, sum = 8 <= 10
 * start = 4, end = 7, sum = 17 > 10
 * start = 5, end = 7, sum = 15 > 10
 * start = 6, end = 7, sum = 11 > 10
 * start = 7, end = 7, sum = 9 < 10
 * start = 7, end = 8 (end > sizeOfArray) EXIT
 * <p>
 * ANS = 10
 * <p>
 * Read the following code in case you get stuck up in the implementation of this concept.
 * <p>
 * http://ideone.com/2JwMya
 */
public class BirthdayChocolate {

    static int solve(int[] squares, int d, int m) {
        int max = 0, j = 0, count = 0, consecutive = 0;
        for (int i : squares) {
            max += i;
            if (consecutive < m) consecutive++;

            if (consecutive == m) {
                if (max == d) {
                    count++;
                }
                max -= squares[j];
                j++;
            }
            System.out.println("MAX : " + max + " COUNT : " + count + " CONSECUTIVE: " + consecutive);
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(s, d, m);
        System.out.println(result);
    }
}
