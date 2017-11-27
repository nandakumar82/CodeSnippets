package com.nanda.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nandakumar.Menon on 24-11-2017.
 */
public class SearchString {
    public static void main(String[] args) {
        String[] sample = {"APPLE", "BALANCE", "BANANA", "BELL", "GLOBAL"};
        String toBeSearched = "BA";
        List<String> output = new ArrayList();

        for (int i = 0; i < sample.length; i++) {

            if (searchPrefixPresent(sample[i], toBeSearched)) {
                output.add(sample[i]);
            }
        }
        System.out.println(output);
    }

    private static boolean searchPrefixPresent(String value, String prefix) {
        char sampleData[] = value.toCharArray();// value
        int offset = 0;
        char dataToBeSearched[] = prefix.toCharArray();//value to be searched
        int pointer = 0;
        int searchDataLength = prefix.length();
        while (--searchDataLength >= 0) {
            if (sampleData[offset++] != dataToBeSearched[pointer++]) {
                return false;
            }
        }
        return true;
    }
}
