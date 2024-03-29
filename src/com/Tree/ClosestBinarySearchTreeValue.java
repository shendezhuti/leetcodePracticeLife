package com.Tree;

/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 *
 * Note:
 *
 * Given target value is a floating point.
 * You are guaranteed to have only one unique value in the BST that is closest to the target.
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int closest=root.val;

        while(root!=null){
                closest=Math.abs(closest-target)<Math.abs(root.val-target)? closest:root.val;
                root=target<root.val? root.left:root.right;
        }
        return closest;
    }
    }
