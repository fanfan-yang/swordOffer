package com.company.offer3_duplicate;

/**
 * Do not make changes to the input array
 *
 * to find one of the duplicated numbers in the input array,
 * whose length is n + 1, and all elements are within 1 ~ n
 *
 */

public class Solution2 {

    /**
     * Utilize Dichotomy
     *
     * @param num
     * @return
     */
    public static int findDuplication (int[] num){

        //Forbidden null input array and empty input array
        if(num == null || num.length == 0){
            return -1;
        }

        //Forbidden invalid numbers in the input array
        for(int i : num){
            if(i < 1 || i > num.length - 1){
                return -1;
            }
        }

        // no-empty input array
        int start, end, middle;
        start = 1;
        end = num.length - 1;

        while (end >= start){
            middle = ((end - start) >> 1) + start;

            int count = countRange(num, middle, start);

            if(count > (middle - start + 1)){
                end = middle;
            }
            else {
                start = middle + 1;
            }

            // End Condition
            if(end == start){
                // Return true, only if (count > 1) by the end of the loop!!!
                if(count > 1){
                    return start;
                }
                else {
                    break;
                }

            }
        }

        return -1;
    }

      /* calculate how many numbers are between start and end */
    public static int countRange(int[] num, int end, int start){
        int count = 0;
        for(int i : num){
            if(i >= start && i <= end){
                count++;
            }
        }
        return count;
    }


}
