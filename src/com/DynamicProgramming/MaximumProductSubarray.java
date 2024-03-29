package com.DynamicProgramming;

/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 * Example 1:
 *
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 *
 * Input: [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums.length==0)return 0;

        int maxherepre=nums[0];
        int minherepre=nums[0];
        int maxsofar=nums[0];
        int maxhere,minhere;

        for(int i=1;i<nums.length;i++){
            maxhere=Math.max(Math.max(maxherepre*nums[i],minherepre*nums[i]),nums[i]);
            minhere=Math.min(Math.min(maxherepre*nums[i],minherepre*nums[i]),nums[i]);
            maxsofar=Math.max(maxhere,maxsofar);
            maxherepre=maxhere;
            minherepre=minhere;
        }
        return maxsofar;
    }
    }
