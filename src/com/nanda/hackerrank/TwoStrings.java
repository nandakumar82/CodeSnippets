package com.nanda.hackerrank;

import java.io.IOException;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by Nandak on Apr, 2020
 */
public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> charSet1 = toCharSet(s1);
        Set<Character> charSet2 = toCharSet(s2);
        charSet1.retainAll(charSet2);
        if (charSet1.size() > 0) {
            return "YES";
        } else {
            return "NO";
        }

      /*  return IntStream.rangeClosed('a', 'z')
                .filter(c -> s1.indexOf(c) != -1 && s2.indexOf(c) != -1)
                .findFirst()
                .isPresent()
                ? "YES"
                : "NO";*/

      /*  IntStream alphabets = "abcdefghijklmnopqrstuvwxyz".chars();
        OptionalInt alpha = alphabets
                .filter( c -> s1.indexOf(c) != -1 && s2.indexOf(c) != -1)
                .findFirst();
        return alpha.isPresent()  ? "YES" : "NO";*/
    }

    public static Set<Character> toCharSet(String word) {
        Set<Character> charSet = new HashSet<Character>();
        for (int i = 0; i < word.length(); i++) {
            charSet.add(word.charAt(i));
        }
        return charSet;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
