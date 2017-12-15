package com.nanda.algorithms;

import java.util.*;

/**
 * Created by Nandakumar.Menon on 25-11-2017.
 * <p>
 * Solve the following by using either JAVA/C#/C++
 * There are N rods with different weights in specific order. A worker is going to make the joints for all the rods. And each time, the worker can only make a joint for 2 adjacent rods. The worker need spent effort to lift up both rods for making the joint.
 * Write a program to help the worker to determine how to join all the rods together with the minimal effort.
 * e.g. We need to join 3 rods, Rod1[10KG] Rod2[35KG] Rod3[5KG].
 * Option 1
 * step 1: Rod1 + Rod2 = Joint Rod(1&2) [45KG]
 * step 2: Joint Rod(1&2) + Rod3
 * = Joint Rod(1&2&3) [50KG]
 * Total effort is 95KG.
 * Option 2
 * step 1: Rod2 + Rod3 = Joint Rod(2&3) [40KG]
 * step 2: Rod1 + Joint Rod(2&3)
 * = Joint Rod(1&2&3) [50KG]
 * Total effort is 90KG.
 * So Option 2 save the worker effort.
 * You may assume the input will in the format of N,W1,W2,W3,W4,…,WN
 * e.g. in the above example, the input will be 3,10,35,5
 * <p>
 * TEST DATA
 * ---------------------------------------------------------------------------------------
 * <p>
 * I/P 2 30 40
 * O/P 70
 * <p>
 * I/P 3 30 40 50
 * O/P 190, 210
 * <p>
 * I/P 4 30 40 50 10
 * O/P 260,410, 430
 * <p>
 * I/P 5 30 40 50 60 10
 * O/P 600, 730, 670, 560
 * <p>
 * I/P 6 30 40 50 60 10 20
 * O/P 1360, 1350, 740, 780, 700
 * <p>
 * I/P 7 30 40 50 60 10 20 30
 * O/P 1320, 1430, 900 , 1510, 1440
 * <p>
 * I/P 8 30 40 50 60 10 20 30 40
 * O/P 1840, 1620, 1870, 1460, 1120, 1540
 * <p>
 * I/P 9 10 20 30 40 50 20 30 40 10
 * O/P 1660, 1540, 1930, 1780
 * <p>
 * I/P 10 10 20 30 40 50 20 30 40 10 20
 * O/P 3880, 3890, 1980, 1800, 1820, 1640,
 */
public class JoinRods {

    public static final String LEAST_EFFORT_INVOLVED_IS = "Least Effort involved is ";
    public static final String FORMATTER = "-----------------------------------------------";
    private static final String EFFORT_INVOLVED_IS = "Effort involved is-----------------------------------------> ";
    private static TreeMap<Integer, Integer> resultMap = new TreeMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] weightArray = new int[size];
        populateWeightArray(in, size, weightArray);
        int result = groupAdjacentRodsType1(size, weightArray);
        printEffort(result);
        if (size != 2) {
            if (checkIsNotEven(size)) {
                doOperationForOddCollectionSet(size, weightArray);
            } else {
                doOperationForEvenCollectionSet(size, weightArray);

            }
        }
        System.out.println(FORMATTER);
        System.out.println(LEAST_EFFORT_INVOLVED_IS + resultMap.firstKey());
        System.out.println(FORMATTER);


    }

    /**
     * Grouping adjacent rod as pairs TYPE 1
     *
     * @param size
     * @param weightArray
     * @return
     */
    private static int groupAdjacentRodsType1(int size, int[] weightArray) {
        // System.out.println("Inside groupAdjacentRodsType1 begins");
        int weightJoins = 0;
        int newIndex = 1;
        int prevIndex = 0;
        Map<String, Integer> pairs = new LinkedHashMap<>();
        int index = 0;
        int weightIndex;
        int[] finalWeightArray = new int[0];

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
            if (checkIsNotEven(size)) {
                pairs.put("effort" + (index), weightArray[index]);
            }
        }

        size = getPairSizeFromMap(pairs);
        if (size != 0) {
            finalWeightArray = getFinalArray(size, pairs);
            executeForNonEvenSet(size, finalWeightArray);
        }


        //TODO check for larger result set
        if (size >= 4 && checkIsEven(size)) {
            doOperationForEvenCollectionSet(size, finalWeightArray);
        }

        if (size != 0) {
            return groupAdjacentRodsType1(size, finalWeightArray);
        }
        //  System.out.println("Inside groupAdjacentRodsType1 Exits");
        return weightJoins;
    }

    /**
     * Grouping adjacent rod as pairs TYPE 2
     *
     * @param size
     * @param weightArray
     * @return
     */
    private static int groupAdjacentRodsType2(int size, int[] weightArray) {
        //  System.out.println("Inside groupAdjacentRodsType2 begins");

        int weightJoins;
        int newIndex = 2;
        int prevIndex = 1;
        Map<String, Integer> pairs = new LinkedHashMap<>();
        int index = 0;
        int weightIndex;
        int[] finalWeightArray;

        if (checkIsNotEven(size)) {
            pairs.put("effort" + index, weightArray[index]);
        }
        for (weightIndex = 0; weightIndex < size / 2; weightIndex++) {
            weightJoins = weightArray[prevIndex] + weightArray[newIndex];
            pairs.put("effort" + ++index, weightJoins * 2);
            prevIndex = prevIndex + 2;
            newIndex = newIndex + 2;
        }
        size = getPairSizeFromMap(pairs);
        finalWeightArray = getFinalArray(size, pairs);
        executeForNonEvenSet(size, finalWeightArray);

        if (checkIsEven(size)) {
            int minimumEffort1;
            if (size == 2) {
                minimumEffort1 = groupAdjacentRodsType1(size, finalWeightArray);
                printEffort(minimumEffort1);
            } else {
                minimumEffort1 = groupAdjacentRodsType1(size, finalWeightArray);
                int minimumEffort3 = groupAdjacentRodsType3(size, finalWeightArray);
                printEffort(minimumEffort1);
                printEffort(minimumEffort3);
            }

        }

        // System.out.println(pairs);
        // System.out.println("Inside groupAdjacentRodsType2 Exits");
        weightJoins = 0;
        return weightJoins;
    }

    /**
     * Grouping adjacent rod as pairs TYPE 3
     *
     * @param size
     * @param weightArray
     * @return
     */
    private static int groupAdjacentRodsType3(int size, int[] weightArray) {
        // System.out.println("Inside groupAdjacentRodsType3 begins");

        int weightJoins;
        int newIndex = 2;
        int prevIndex = 1;
        Map<String, Integer> pairs = new LinkedHashMap<>();
        int index = 0;
        int weightIndex;
        int[] finalWeightArray;
        int weightIndex0;
        int weightIndexN;
        int minimumEffort1;
        int minimumEffort2 = 0;

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

        size = getPairSizeFromMap(pairs);
        finalWeightArray = getFinalArray(size, pairs);

        executeForNonEvenSet(size, finalWeightArray);

        minimumEffort1 = groupAdjacentRodsType1(size, finalWeightArray);
        printEffort(minimumEffort1);

        //  System.out.println(pairs);
        if (checkIsEven(size)) {
            return groupAdjacentRodsType3(size, finalWeightArray);
        }
        //System.out.println(pairs);
        //System.out.println("Inside groupAdjacentRodsType3 Exits");

        return Math.min(minimumEffort1, minimumEffort2);

    }

    /**
     * Forms an array from the pairs map
     *
     * @param size
     * @param pairs
     * @return
     */
    private static int[] getFinalArray(int size, Map<String, Integer> pairs) {
        int[] finalWeightArray;
        finalWeightArray = new int[size];
        Iterator<String> iterator = pairs.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String key = iterator.next();
            //System.out.println("Map Value:" + pairs.get(key));
            finalWeightArray[i++] = pairs.get(key);
        }
        return finalWeightArray;
    }

    /**
     * When size is equal to 2, perform simple join
     *
     * @param weightArray
     * @return
     */
    private static int getWeightJoins(int[] weightArray) {
        int weightJoins;
        weightJoins = weightArray[0] + weightArray[1];
        return weightJoins;
    }

    /**
     * @param size
     * @param finalWeightArray
     */
    private static void executeForNonEvenSet(int size, int[] finalWeightArray) {
        if (checkIsNotEven(size)) {
            int minimumEffort1 = groupAdjacentRodsType1(size, finalWeightArray);
            int minimumEffort2 = groupAdjacentRodsType2(size, finalWeightArray);
            printEffort(minimumEffort1);
            printEffort(minimumEffort2);
        }
    }

    /**
     * Utility used to establish whether the pair map is even
     *
     * @param size
     * @return
     */
    private static boolean checkIsEven(int size) {
        return size % 2 == 0;
    }

    /**
     * Utility used to establish whether the pair map is odd
     *
     * @param size
     * @return
     */
    private static boolean checkIsNotEven(int size) {
        return size % 2 != 0;
    }

    /**
     * Print Effort utilized
     *
     * @param result
     */
    private static void printEffort(int result) {
        if (result != 0) {
            resultMap.put(result, result);
            System.out.println(EFFORT_INVOLVED_IS + result);
        }
    }

    /**
     * Beginner operations
     *
     * @param size
     * @param weightArray
     */
    private static void doOperationForEvenCollectionSet(int size, int[] weightArray) {
        int result2 = groupAdjacentRodsType3(size, weightArray);
        printEffort(result2);
    }

    /**
     * Beginner operations
     *
     * @param size
     * @param weightArray
     */
    private static void doOperationForOddCollectionSet(int size, int[] weightArray) {
        int result1 = groupAdjacentRodsType2(size, weightArray);
        printEffort(result1);
    }

    /**
     * Populates the array from the console input
     *
     * @param in
     * @param size
     * @param weightArray
     */
    private static void populateWeightArray(Scanner in, int size, int[] weightArray) {
        for (int weightIndex = 0; weightIndex < size; weightIndex++) {
            weightArray[weightIndex] = in.nextInt();
        }
    }

    /**
     * Get the map size or pair size
     *
     * @param pairs
     * @return
     */
    private static int getPairSizeFromMap(Map<String, Integer> pairs) {
        int size;
        size = pairs.size();
        return size;
    }

}
