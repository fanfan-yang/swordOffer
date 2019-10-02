package com.company.offer3_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution0 {

    /**
     * Utilize HashTable
     *
     * @param intArray
     * @param duplication
     * @return
     */

    public static boolean duplicate (int[] intArray, int[] duplication) {

        //Ban null intArray and empty intArray
        if(intArray == null || intArray.length == 0){
            duplication[0] = -1;
            return false;
        }

        //Non-empty intArray
        Map<Integer, Integer> map = new HashMap<> (intArray.length);

        for(int i = 0; i < intArray.length; i++){

            //invalid input
            if(intArray[i] < 0 || intArray[i] > intArray.length - 1){
                duplication[0] = -1;
                return false;
            }

            //The same number has not appeared before
            if(map.get(intArray[i]) == null){
                map.put(intArray[i], i);
            }
            //The same number has appeared before
            else {
                duplication[0] = intArray[i];
                return true;
            }
        }

        duplication[0] = -1;
        return false;
    }
}
