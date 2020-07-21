package com.nanda.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Nandak on Jul, 2020
 */
public class CountStringCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the String : ");
        s = sc.nextLine();

        countCharctersInString(s);
    }

    private static void countCharctersInString(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        int stringLength = s.length();
        char[] charArr = s.toCharArray();
        Integer count;
        int frequency = 0;
        for (char character : charArr) {
            count = characterMap.get(character);
            characterMap.put(character,count==null?1:++count);
        }

        Set<Character> entries = characterMap.keySet();
        for (Character entry : entries) {
           frequency+= characterMap.get(entry);
        }
        System.out.println(frequency);

        /*Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.);
        }*/


    }
}
