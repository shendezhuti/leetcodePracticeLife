package com.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Example:
 *
 * You may serialize the following tree:
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * as "[1,2,3,null,null,4,5]"
 * Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 *
 * Accepted
 * 172,727
 * Submissions
 * 429,804
 */
public class SerializeandDeserializeBinaryTree {
    private static final String spliter = ",";
    private static final String NN = "X";
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        buildString(root,sb);
        return sb.toString();
    }

    private void buildString(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append(NN).append(spliter);
        }else{
            sb.append(node.val).append(spliter);
            buildString(node.left,sb);
            buildString(node.right,sb);
        }
    }

    public TreeNode deserialize(String data) {
        Queue<String> nodes=new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }
    private TreeNode buildTree(Queue<String> nodes ){
        String val= nodes.remove();
        if(val.equals(NN)) return null;
        else{
            TreeNode node=new TreeNode(Integer.valueOf(val));
            node.left=buildTree(nodes);
            node.right=buildTree(nodes);
            return node;
        }
    }

    }
