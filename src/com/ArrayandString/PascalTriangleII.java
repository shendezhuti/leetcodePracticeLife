package com.ArrayandString;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalTriangleII {
    public List<Integer> gewRow(int rowIndex){
        List<Integer> ret=new ArrayList<Integer>();
        ret.add(1);
        for(int i=1;i<rowIndex;i++){
            for(int j=i-1;j>0;j--){
                int temp=ret.get(j-1)+ret.get(j);
                ret.set(j,temp);
            }
            ret.add(1);
        }

        return ret;
    }

}
