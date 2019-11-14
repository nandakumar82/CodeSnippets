package com.nanda.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Nandak on Oct, 2019
 */

public class FindDuplicates {;

    ublic static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 1, 3, 4, 4};
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> allItems.add(n) != true) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println(duplicates); // [1, 4]
    }


}
