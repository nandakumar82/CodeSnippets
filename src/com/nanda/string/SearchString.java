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

            if (startsWith(sample[i], toBeSearched, 0)) {
                output.add(sample[i]);
            }
        }
        System.out.println(output);
    }

    private static boolean startsWith(String value, String prefix, int toffset) {
        char sampleData[] = value.toCharArray();// value
        int offset = toffset;
        char dataToBeSearched[] = prefix.toCharArray();//value to be searched
        int pointer = 0;
        int searchDataLength = prefix.length();
        // Note: toffset might be near -1>>>1.
        if ((toffset < 0) || (toffset > value.length() - searchDataLength)) {
            return false;
        }
        while (--searchDataLength >= 0) {
            if (sampleData[offset++] != dataToBeSearched[pointer++]) {
                return false;
            }
        }
        return true;
    }
}
