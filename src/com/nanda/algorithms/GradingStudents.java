package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 19-07-2017.
 */
public class GradingStudents {
    static int[] solve(int[] grades) {
        // Complete this function
        int[] new_grades = new int[grades.length];
        for (int grades_i = 0; grades_i < grades.length; grades_i++) {
            int quotient = grades[grades_i] / 5;
            int nextMultiple = quotient + 1;
            if (grades[grades_i] < 38) {
                new_grades[grades_i] = grades[grades_i];
            } else if (((nextMultiple * 5) - grades[grades_i]) < 3) {
                new_grades[grades_i] = nextMultiple * 5;
            } else if ((nextMultiple * 5) - grades[grades_i] == 3) {
                new_grades[grades_i] = grades[grades_i];
            } else {
                new_grades[grades_i] = grades[grades_i];
            }

        }
        return new_grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
