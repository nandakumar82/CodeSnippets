package com.nanda.algorithms;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Created by Nandakumar.Menon on 25-07-2017.
 */
public class MigratoryBirds {

    static void migratoryBirds(int n, int[] ar) {
        // Complete this function
        SortedMap<Integer, Integer> birdMap = new TreeMap<>();

        for (int ar_i = 0; ar_i < n; ar_i++) {
            if (birdMap.containsKey(ar[ar_i])) {
                birdMap.put(ar[ar_i], birdMap.get(ar[ar_i]) + 1);
            } else {
                birdMap.put(ar[ar_i], 1);
            }
        }
        Set<Entry<Integer, Integer>> set = birdMap.entrySet();
        List<Entry<Integer, Integer>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        for (Entry<Integer, Integer> entry : list) {
            // System.out.println(entry.getKey()+" ==== "+entry.getValue());
            System.out.println(entry.getKey());
            break;
        }

        LinkedHashMap<Integer, Integer> sortedMap =
                birdMap.entrySet().stream().
                        sorted(Entry.comparingByValue()).
                        collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        //int result =
        migratoryBirds(n, ar);
        // System.out.println(result);
    }
}
