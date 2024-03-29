package com.Tree;

/**
 * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
 *
 * The length of path between two nodes is represented by the number of edges between them.
 *
 *
 *
 * Example 1:
 *
 * Input:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * Output: 2
 *
 *
 *
 * Example 2:
 *
 * Input:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * Output: 2
 *
 *
 *
 * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 */
public class LongestUnivaluePath {

    private int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        univaluePath(root);
        return ans;
    }

    private int univaluePath(TreeNode root) {
        if (root == null) return 0;
        int l = univaluePath(root.left);
        int r = univaluePath(root.right);
        int pl = 0;
        int pr = 0;
        if (root.left != null && root.val == root.left.val) pl = l + 1;
        if (root.right != null && root.val == root.right.val) pr = r + 1;
        ans = Math.max(ans, pl + pr);
        return Math.max(pl, pr);
    }
}
