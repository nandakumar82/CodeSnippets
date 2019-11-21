package com.nanda.java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Nandak on Oct, 2019
 */
public class FlattenStreams {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> collect = words.stream().map(w -> w.split("")).flatMap(array -> Arrays.stream(array)).distinct().collect(toList());
//         words.stream().map(w -> w.split("")).distinct().forEach(System.out::println);
//        words.stream().map(w -> w.split("")).distinct().collect(toList()).forEach(System.out::println);
//     collect.stream().forEach(System.out::println);

//

    }


}
