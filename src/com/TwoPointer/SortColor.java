package com.TwoPointer;

/**
 *Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Follow up:
 *
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 */
public class SortColor {
    public void sortColors(int[]nums) {
        if (nums == null || nums.length == 1) return;
        int first = 0;
        while (first < nums.length && nums[first] == 0) first++;

        int last = nums.length - 1;
        while (last >=0 && nums[last] == 2) last--;

        int index = first;
        while (index <= last) {
            if (nums[index] == 1) index++;
            else if (nums[index] == 0) {
                swap(nums, first, index);
                first++;
                index++;
            }else if(nums[index]==2){
                swap(nums,last,index);
                last--;
              //  index++;要非常注意，这里是没有index++的，因为后面的数字我们还没有遍历过
            }

        }
    }

    public void swap(int[]nums,int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;

    }
}
