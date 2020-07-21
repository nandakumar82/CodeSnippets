package com.nanda.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nandak on Apr, 2020
 */
public class RansomNotes {
    static void checkMagazine(String[] magazine, String[] note) {
        int magazineLength = magazine.length;
        int noteLength = note.length;
        boolean canCreateFromMagazine = true;

        Map<String, Integer> magazineWordsMap = new HashMap<>();
        for (String word : magazine) {
            Integer wordCount = magazineWordsMap.get(word);
            magazineWordsMap.put(word, wordCount != null ? ++wordCount : 1);
        }

        for (String word : note) {
            if (magazineWordsMap.get(word) == null) {
                canCreateFromMagazine = false;
                break;
            } else {
                Integer count = magazineWordsMap.get(word);
                magazineWordsMap.put(word, --count);
                if (count == 0) {
                    magazineWordsMap.remove(word);
                }
            }
        }

        if (canCreateFromMagazine) {
            System.out.println("Yes");

        } else {
            System.out.println("No");

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
