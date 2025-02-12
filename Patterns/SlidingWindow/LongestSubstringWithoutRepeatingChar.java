
//3. Longest Substring Without Repeating Characters

//Given a string s, find the length of the longest
//        substring
//        without repeating characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
package Patterns.SlidingWindow;


import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {


    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int length = 0;
        int maxLength = 0;
        HashSet <Character> set = new HashSet<>();
        while(r<s.length()){

            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
                length--;
            }else{
                set.add(s.charAt(r));
                length ++;
                r++;
            }
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }



}
