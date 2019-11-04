package com.company.offer8_getNext;

public class Solution0 {

    public static TreeNode getNext (TreeNode pNode) {
        if (pNode == null) return null;

        if (pNode.right != null) {
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }

        else {
            while (pNode.parent != null) {
                if (pNode == pNode.parent.left) {
                    return pNode.parent;
                }
                pNode = pNode.parent;
            }
        }

        return null;
    }
}
