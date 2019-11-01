package com.company.offer6_printListFromTailToHead;

import java.util.ArrayList;

/**
 * Print List From Tail To Head
 * Can not make changes to the original listNode
 *
 * Using Recursion!
 *
 */

public class Solution1 {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> ret = new ArrayList<Integer>();

        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;

    }

}
