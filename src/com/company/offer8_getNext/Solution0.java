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

        else if (pNode.parent != null){
            return pNode.parent.parent;
        }

        return null;
    }
}
