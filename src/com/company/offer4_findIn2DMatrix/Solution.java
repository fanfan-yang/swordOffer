package com.company.offer4_findIn2DMatrix;

public class Solution {

    public static boolean find(int[][] array, int target){

        //Forbidden null array and empty array
        if(array == null || array.length == 0){
            return false;
        }

        // valid input
        int i, j;
        i = 0;
        j = array[0].length - 1;

        while (i < array.length && j >= 0){
            if(array[i][j] == target){
                return true;
            }

            else if(array[i][j] > target){
                i--;
            }

            else{
                j++;
            }

        }

        return false;
    }
}
