package com.nanda.algorithms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 28-09-2017.
 *
 * Solve the following by using either JAVA/C#/C++
 There are N rods with different weights in specific order. A worker is going to make the joints for all the rods. And each time, the worker can only make a joint for 2 adjacent rods. The worker need spent effort to lift up both rods for making the joint.
 Write a program to help the worker to determine how to join all the rods together with the minimal effort.
 e.g. We need to join 3 rods, Rod1[10KG] Rod2[35KG] Rod3[5KG].
 Option 1
 step 1: Rod1 + Rod2 = Joint Rod(1&2) [45KG]
 step 2: Joint Rod(1&2) + Rod3
 = Joint Rod(1&2&3) [50KG]
 Total effort is 95KG.
 Option 2
 step 1: Rod2 + Rod3 = Joint Rod(2&3) [40KG]
 step 2: Rod1 + Joint Rod(2&3)
 = Joint Rod(1&2&3) [50KG]
 Total effort is 90KG.
 So Option 2 save the worker effort.
 You may assume the input will in the format of N,W1,W2,W3,W4,…,WN
 e.g. in the above example, the input will be 3,10,35,5
 */
public class JoinRods {


    private static final String EFFORT_INVOLVED_IS = "Effort involved is-----------------------------------------> ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] weightArray = new int[size];
        for (int weightIndex = 0; weightIndex < size; weightIndex++) {
            weightArray[weightIndex] = in.nextInt();
        }
        int result = minimumEffort1(size, weightArray);
        System.out.println(EFFORT_INVOLVED_IS +result);
        if (size != 2) {
            if (size % 2 != 0) {
                // for odd collection set
                int result1 = minimumEffort2(size, weightArray);
                System.out.println(EFFORT_INVOLVED_IS + result1);
            } else {
                // for even collection set
                int result2 = minimumEffort3(size, weightArray);
                System.out.println(EFFORT_INVOLVED_IS + result2);
            }
        }

    }

    private static int minimumEffort1(int size, int[] weightArray) {
        System.out.println("Inside minimumEffort1 begins");
        int weightJoins = 0;
        int newIndex = 1;
        int prevIndex = 0;
        Map<String, Integer> pairs = new LinkedHashMap<>();
        int evenOrOdd = size % 2;
        int index = 0;
        int weightIndex;
        int[] finalWeightArray;

        // if (evenOrOdd != 0) {
        if (size == 2) {
            weightJoins = getWeightJoins(weightArray);
        } else {
            for (weightIndex = 0; weightIndex < size / 2; weightIndex++) {
                weightJoins = weightArray[prevIndex] + weightArray[newIndex];
                pairs.put("effort" + ++index, weightJoins * 2);
                prevIndex = prevIndex + 2;
                newIndex = newIndex + 2;
                index = prevIndex;
            }
            if (size % 2 != 0) {
                pairs.put("effort" + (index), weightArray[index]);
            }
        }

        size = pairs.size();
        finalWeightArray = getFinalArray(size, pairs);

        if (size == 3) {
            int minimumEffort1 = minimumEffort1(size, finalWeightArray);
            int minimumEffort2 = minimumEffort2(size, finalWeightArray);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort1);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort2);

        }

        if (size == 4) {
            int minimumEffort3 = minimumEffort3(size, finalWeightArray);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort3);
        }

        if (size != 0) {
            return minimumEffort1(size, finalWeightArray);
        }
        System.out.println("Inside minimumEffort1 Exits");

        return weightJoins;
    }

    private static int minimumEffort2(int size, int[] weightArray) {
        System.out.println("Inside minimumEffort2 begins");

        int weightJoins;
        int newIndex = 2;
        int prevIndex = 1;
        Map<String, Integer> pairs = new LinkedHashMap<>();
        int index = 0;
        int weightIndex;
        int[] finalWeightArray;

        if (size == 2) {
            weightJoins = getWeightJoins(weightArray);
        } else {
            if (size % 2 != 0) {
                pairs.put("effort" + index, weightArray[index]);
            }
            for (weightIndex = 0; weightIndex < size / 2; weightIndex++) {
                weightJoins = weightArray[prevIndex] + weightArray[newIndex];
                pairs.put("effort" + ++index, weightJoins * 2);
                prevIndex = prevIndex + 2;
                newIndex = newIndex + 2;
            }
        }
        size = pairs.size();
        finalWeightArray = getFinalArray(size, pairs);

        if (size == 3) {
            int minimumEffort1 = minimumEffort1(size, finalWeightArray);
            int minimumEffort2 = minimumEffort2(size, finalWeightArray);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort1);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort2);
        }

        if (size % 2 == 0) {
            int minimumEffort1;
            if (size == 2) {
                minimumEffort1 = minimumEffort1(size, finalWeightArray);
                System.out.println(EFFORT_INVOLVED_IS +minimumEffort1);

            } else {
                minimumEffort1 = minimumEffort1(size, finalWeightArray);
                int minimumEffort3 = minimumEffort3(size, finalWeightArray);
                System.out.println(EFFORT_INVOLVED_IS +minimumEffort1);
                System.out.println(EFFORT_INVOLVED_IS +minimumEffort3);
            }

        }

       /* if (size != 0) {
            return minimumEffort2(size, finalWeightArray);
        }*/
        System.out.println(pairs);
        System.out.println("Inside minimumEffort2 Exits");
        weightJoins = 0;

        return weightJoins;
    }


    private static int minimumEffort3(int size, int[] weightArray) {
        System.out.println("Inside minimumEffort3 begins");

        int weightJoins;
        int newIndex = 2;
        int prevIndex = 1;
        Map<String, Integer> pairs = new LinkedHashMap<>();
        int index = 0;
        int weightIndex;
        int[] finalWeightArray;
        int weightIndex0;
        int weightIndexN;
        int minimumEffort1 = 0;
        int minimumEffort2 = 0;

        if (size == 2) {
            weightJoins = getWeightJoins(weightArray);
        } else {
            weightIndex0 = weightArray[0];
            weightIndexN = weightArray[size - 1];
            pairs.put("effort" + index++, weightIndex0);

            for (weightIndex = 1; weightIndex < size / 2; weightIndex++) {
                weightJoins = weightArray[prevIndex] + weightArray[newIndex];
                pairs.put("effort" + index++, weightJoins * 2);
                prevIndex = prevIndex + 2;
                newIndex = newIndex + 2;
            }
            pairs.put("effort" + index++, weightIndexN);

        }
        size = pairs.size();
        finalWeightArray = getFinalArray(size, pairs);
        if (size == 3) {
            minimumEffort1 = minimumEffort1(size, finalWeightArray);
            minimumEffort2 = minimumEffort2(size, finalWeightArray);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort1);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort2);

        }
        if (size == 4) {
            minimumEffort1 = minimumEffort1(size, finalWeightArray);
            System.out.println(EFFORT_INVOLVED_IS + minimumEffort1);

        }
        System.out.println(pairs);
        if (size != 3) {
            //int minimumEffort1 = minimumEffort1(size, finalWeightArray);
            //int minimumEffort2 = minimumEffort2(size, finalWeightArray);
            //int minimumEffort3 = minimumEffort3(size, finalWeightArray);
            //System.out.println(minimumEffort1);
            //System.out.println(minimumEffort3);
            return minimumEffort3(size, finalWeightArray);
        }
        System.out.println(pairs);
        System.out.println("Inside minimumEffort3 Exits");

        return Math.min(minimumEffort1, minimumEffort2);

    }

    private static int[] getFinalArray(int size, Map<String, Integer> pairs) {
        int[] finalWeightArray;
        finalWeightArray = new int[size];
        Iterator<String> iterator = pairs.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Map Value:" + pairs.get(key));
            finalWeightArray[i++] = pairs.get(key);
        }
        return finalWeightArray;
    }

    private static int getWeightJoins(int[] weightArray) {
        int weightJoins;
        weightJoins = weightArray[0] + weightArray[1];
        return weightJoins;
    }
}
