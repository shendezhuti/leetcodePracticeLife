package com.Math;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example 1:
 *
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 *
 * Input: a = -2, b = 3
 * Output: 1
 */
public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        int c=0;
        while(b!=0){
            c=(a&b);
            a=a^b;
            b=(c)<<1;
        }
        return a;
    }
}
