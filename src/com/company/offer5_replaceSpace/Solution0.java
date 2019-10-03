package com.company.offer5_replaceSpace;



public class Solution0 {

    public static void replaceBlank(StringBuilder str){

        // null input or empty input
        if(str == null || str.length() == 0){
            return;
        }

        //valid input
        int oldLength = str.length();

        for (int i = 0 ; i < oldLength; i++){
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }

        int newLength = str.length();
        int p1 = oldLength - 1;
        int p2 = newLength - 1;
        String replace = "%20";
        while(p1 != p2){
            if(p1 == ' ') {
                str.replace(p2-2, p2, replace);
                p2 -= 3;
            }
            else {
                str.setCharAt(p2--, str.charAt(p1--));
            }
        }

        return;
    }
}
