package com.company.offer9_buildQueue;

import java.util.Stack;

public class Solution1 {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void addTail (int node) {
        stack1.push(node);
    }

    public int deleteHead () throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        else if (stack1.isEmpty()) {
            throw new Exception("queue is empty.");
        }

        return stack2.pop();
    }

}
