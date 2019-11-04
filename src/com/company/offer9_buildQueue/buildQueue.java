package com.company.offer9_buildQueue;

import java.util.Stack;

public class buildQueue {

    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void addTail (int node) {
        stack1.push(node);
    }

    public int deleteHead () {
        int ret;
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        ret = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return ret;
    }
}
