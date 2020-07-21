package com.nanda.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Nandak on Jul, 2020
 */
public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        List<String> subStrings = getSubStrings(s);

        List<String> distinctSubString = setOfDistinctSubStrings(subStrings);


        long distinctCharactersSubString = findDistinctCharacters(subStrings);
        long distinctCharactersDistinctSubString = findDistinctCharacters(distinctSubString);


        //countCharctersInString(s);
        System.out.println(Math.abs(distinctCharactersSubString-distinctCharactersDistinctSubString));
    }

    private static List<String> getSubStrings(String s) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                stringList.add(s.substring(i, j));
            }
        }
        return stringList;
    }

    private static List<String> setOfDistinctSubStrings(List<String> stringList) {
        Set<String> stringSet = new HashSet<>();
        List<String> list = new ArrayList<>();
        stringSet.addAll(stringList);
        list.addAll(stringSet);
        return list;

    }

    private static long findDistinctCharacters(List<String> stringList) {
        long count = 0;
        for (String s : stringList) {
             count+= s.chars().distinct().count();
        }
        return count;
    }
}
