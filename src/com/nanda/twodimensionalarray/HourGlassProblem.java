package com.nanda.twodimensionalarray;

import java.util.*;

/**
 * Created by Nandakumar.Menon on 13-05-2017.
 */
public class HourGlassProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();


            }
        }

        int sum = 0;
        //forming the hourglass
        int rowIndex;
        int hourStick;

        Map<String, Integer> sumMap = new LinkedHashMap<>();

        for (int row = 0; row < 4; row++) {
            hourStick = 1;

            for (int column = 0; column < 4; column++) {
                rowIndex = row;

                for (int k = column; k < column + 3; k++) {
                    sum += arr[rowIndex][k];
                }
                rowIndex++;


                sum += arr[rowIndex][hourStick];
                hourStick++;
                rowIndex++;


                for (int k = column; k < column + 3; k++) {
                    sum += arr[rowIndex][k];
                }
                 sumMap.put("SUM[" + row + "," + column + "]", sum);


                //System.out.println("Map values " + sumMap);
                sum = 0;

            }
        }

        Comparator<? super Map.Entry<String, Integer>> maxValueComparator = Comparator.comparing(Map.Entry::getValue);
        Optional<Map.Entry<String, Integer>> max = sumMap.entrySet().stream().max(maxValueComparator);
        System.out.println(max.get().getValue());

/*

        Comparator<? super Map.Entry<Integer, Integer>> maxValueComparator = (
                entry1, entry2) -> entry1.getValue().compareTo(
                entry2.getValue());

*/

       /* Set<Map.Entry<String, Integer>> entries = sumMap.entrySet();


        List<Map.Entry<String, Integer>> arrayList = new ArrayList(entries);

        arrayList.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        for (Map.Entry<String, Integer> stringIntegerEntry : arrayList) {

            System.out.println(" ArrayList is " + stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }*/


    }


}
