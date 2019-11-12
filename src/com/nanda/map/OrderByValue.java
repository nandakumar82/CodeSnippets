package com.nanda.map;

import java.util.*;

/**
 * Created by nandakumar.menon on 03-01-2017.
 */
public class OrderByValue {

    public static void main(String a[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        /*list.sort((Comparator<Map.Entry<String, Integer>>) (o1, o2) -> {

            return (o2.getValue()).compareTo(o1.getValue());
        });*/

        /*Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );*/

        list.sort(OrderByValue::compare);
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }
    }

    private static int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return (o2.getValue()).compareTo(o1.getValue());
    }
}