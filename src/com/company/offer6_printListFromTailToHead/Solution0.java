package com.company.offer6_printListFromTailToHead;


import java.util.ArrayList;
import java.util.Stack;

/**
 * Print A List from tail to head
 * Can not make a change to the original list!
 *
 * Solution0: Using Stack!
 *
 */

public class Solution0 {

    public static ArrayList<Integer> printListFromTailToHead (ListNode listNode){

        ArrayList<Integer> ret = new ArrayList<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while(!stack.empty()) {
            ret.add(stack.pop());
        }

        return ret;
    }
}
