package com.company.offer3_duplicate;

/*
all numbers in the array are between 1 and n-1

to find if there is duplicate numbers in the array
 */

public class Solution1 {


    /**
     * Utilize indexes of intArray
     * @param num intArray
     * @param duplication  return numbers which is duplicated in the intArray
     * @return
     */

    public static boolean duplicate(int[] num, int[] duplication){

        //When the intArray is null || the intArray has a length of 0
        if(num == null || num.length == 0) {
            duplication[0] = -1;
            return false;
        }


        for (int i = 0; i < num.length; i++){

            while(num[i] != i){
                if(num[i] == num[num[i]]) {
                    duplication[0] = num[i];
                    return true;
                }
                else {
                    int temp = num[i];
                    num[i] = num[temp];
                    num[temp] = temp;
                }
            }

        }

        duplication[0] = -1;
        return false;
    }


}
