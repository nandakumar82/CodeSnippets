package com.nanda.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Nandakumar.Menon on 04-01-2017.
 */
public class DuplicateCharsInString {

    public void findDuplicateChars(String str){

        Map<Character, Integer> dupMap = new HashMap<>();
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }

    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }
}
