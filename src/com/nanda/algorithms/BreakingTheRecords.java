package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 22-07-2017.
 */
public class BreakingTheRecords {

    static int[] getRecord(int[] s) {
        // Complete this function
        int maxScore = s[0];
        int countMaxScore = 0;
        int minScore = s[0];
        int countMinScore = 0;
        int[] results = new int[2];

        for (int s_i = 1; s_i < s.length; s_i++) {
            if (maxScore < s[s_i]) {
                maxScore = s[s_i];
                countMaxScore++;
            }
            if (minScore > s[s_i]) {
                minScore = s[s_i];
                countMinScore++;
            }
        }
        results[0] = countMaxScore;
        results[1] = countMinScore;
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);

        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
