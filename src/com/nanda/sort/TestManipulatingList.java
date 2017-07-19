package com.nanda.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandakumar.menon on 07-04-2017.
 */
public class TestManipulatingList {
    public static void main(String args[]) {

    List<Integer> integerList = new ArrayList();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        manipulateArrayList(integerList);
        System.out.println("Values are "+integerList);
    }

    private static void manipulateArrayList(List<Integer> integerList) {
        integerList.remove(0);
    }
}
