package com.ArrayandString;

/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 *
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2:
 *
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s){
        int count=0;
        if(s==null || s.length()==0)return 0;
        for(int i=0;i<s.length();i++){
           count+= entendPalindrome(s,i,i);
            count+=entendPalindrome(s,i,i+1);
        }
        return count;
    }

    private int  entendPalindrome(String s,int left,int right){
        int count=0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
