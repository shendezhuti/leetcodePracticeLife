package com.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class BinaryTreePaths {


    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res= new ArrayList<>();
        helper(root,"",res);
        return res;
    }

    private void helper(TreeNode root,String path,List<String> res){
        if(root.left==null&&root.right==null)res.add(path+root.val);
        if(root.left!=null)helper(root.left,path+"->",res);
        if(root.right!=null)helper(root.right,path+"->",res);
    }
    }
