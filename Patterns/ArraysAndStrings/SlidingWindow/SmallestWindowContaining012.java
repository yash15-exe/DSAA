package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class SmallestWindowContaining012 {
    /*
    Problem Summary:
    Given a string `S` consisting of the characters '0', '1', and '2',
    find the length of the smallest contiguous substring that contains all three characters.
    If no such substring exists, return -1.

    Implementation Approach:
    - Use a sliding window approach with `left` and `right` pointers.
    - Maintain a frequency map to track occurrences of '0', '1', and '2'.
    - Expand the window by moving `right` and updating the frequency map.
    - Once all three characters are present, shrink the window from `left` while maintaining the condition.
    - Track the minimum valid window length.
    - The time complexity is O(N), as each character is processed at most twice.
    */

    public int smallestSubstring(String S) {
        HashSet<Character> set = new HashSet<>();
        boolean isFormed = false;

        // Identify unique characters in the string
        for (Character ch : S.toCharArray()) {
            set.add(ch);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int required = set.size();
        int l = 0, r = 0, n = S.length(), formed = 0, minLength = Integer.MAX_VALUE;

        while (r < n) {
            // Expand window
            map.put(S.charAt(r), map.getOrDefault(S.charAt(r), 0) + 1);
            if (map.get(S.charAt(r)) == 1) formed++;

            // Shrink window while all required characters are present
            while (formed == required) {
                minLength = Math.min(minLength, r - l + 1);
                isFormed = true;
                map.put(S.charAt(l), map.get(S.charAt(l)) - 1);
                if (map.get(S.charAt(l)) == 0) formed--;
                l++;
            }
            r++;
        }
        return isFormed ? minLength : -1;
    }
}
