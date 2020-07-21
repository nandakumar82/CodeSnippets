package com.nanda.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Nandak on Apr, 2020
 */
public class MakingAnagrams {

    static int makeAnagram(String first, String second) {
        int [] letters =  new int[26];
        for(char c : first.toCharArray()){
            letters[c-'a']++;
        }
        for(char c : second.toCharArray()){
            letters[c-'a']--;
        }

        return IntStream.of(letters).map(i -> Math.abs(i)).sum();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        if (res==0)
            System.out.println("anagram");

       /* bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
