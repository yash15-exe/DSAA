//Smallest window containing 0, 1 and 2
//https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1
/*
* Given a string S consisting of the characters 0, 1 and 2.
*  Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2.
*  If no such substring exists, then return -1.
*/


package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class SmallestWindowContaining012 {
    public int smallestSubstring(String S) {
        HashSet<Character> set = new HashSet<>();
        boolean isFormed = false;
        for(Character ch : S.toCharArray()){
            set.add(ch);
        }
        HashMap <Character, Integer> map = new HashMap<>();
        int required = set.size();
        int l = 0, r = 0, n = S.length(), formed = 0, minLength = Integer.MAX_VALUE;
        while(r<n){


            map.put(S.charAt(r), map.getOrDefault(S.charAt(r), 0)+1);
            if(map.get(S.charAt(r))==1)formed++;
            while(formed == required){
                minLength = Math.min(minLength, r-l+1);
                isFormed = true;
                map.put(S.charAt(l), map.get(S.charAt(l))-1);
                if(map.get(S.charAt(l))==0)formed--;
                l++;

            }
            r++;
        }
        return isFormed?minLength:-1;
    }
}
