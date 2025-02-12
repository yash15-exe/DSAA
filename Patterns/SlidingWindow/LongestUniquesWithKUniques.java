//Longest Substring with K Uniques
//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1?page=1&category=Strings&difficulty=Medium&sortBy=submissions
/*
*Given a string s, you need to print the size of the longest possible substring with
* exactly k unique characters. If no possible substring exists, print -1.
*
*/
package Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestUniquesWithKUniques {
    public int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, n = s.length(), maxLength = 0;
        while (r < n){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }

            if(map.size()==k)maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return map.size()<k?-1:maxLength;
    }
}
