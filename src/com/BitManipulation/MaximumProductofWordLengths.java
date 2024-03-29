package com.BitManipulation;

/**
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
 *
 * Example 1:
 *
 * Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
 * Output: 16
 * Explanation: The two words can be "abcw", "xtfn".
 * Example 2:
 *
 * Input: ["a","ab","abc","d","cd","bcd","abcd"]
 * Output: 4
 * Explanation: The two words can be "ab", "cd".
 * Example 3:
 *
 * Input: ["a","aa","aaa","aaaa"]
 * Output: 0
 * Explanation: No such pair of words.
 */
public class MaximumProductofWordLengths {

    public int maxProduct(String[] words) {
        if(words==null||words.length==0){
            return 0;
        }
        int []value=new int[words.length];
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            value[i]=0;
            for(int j=0;j<temp.length();j++){
                value[i]|=1<<(temp.charAt(j)-'a');
            }
        }

        int max=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((value[i]&value[j])==0&&(words[i].length()*words[j].length()>max)){
                    max=words[i].length()*words[j].length();
                }
            }
        }
        return max;

    }
}
