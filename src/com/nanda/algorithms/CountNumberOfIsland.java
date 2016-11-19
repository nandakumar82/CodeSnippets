package com.nanda.algorithms;

/**
 * Created by Nandakumar.Menon on 18-11-2016.
 */
public class CountNumberOfIsland {
    public static void main(String[] args) {

        int[][] island = new int[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0},
                {0, 1, 0}
        };
        System.out.println(countIsland(island));
    }

    public static int countIsland(int[][] island){
        int count=0;

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {

                if(island[i][j] == 1){

                    //check top and left coordinate
                    if( (i-1 < 0 || island[i-1][j] == 0) && (j-1 < 0 || island[i][j-1] == 0) ){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
