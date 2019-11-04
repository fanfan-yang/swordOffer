package com.company.offer7_reconstructBT;

public class Solution0 {

    public static TreeNode reConstructBT (int[] pre, int[] in) {
        TreeNode root = new TreeNode();
        root.val = pre[0];
        root.left.val = pre[1];

        return root;
    }
}
