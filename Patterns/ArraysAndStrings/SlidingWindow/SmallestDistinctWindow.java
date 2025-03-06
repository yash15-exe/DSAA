package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestDistinctWindow {
    /*
    Problem Summary:
    Given a string `s`, find the length of the smallest substring that contains all
    distinct characters of `s` at least once.

    Implementation Approach:
    - First, determine the number of unique characters in `s`.
    - Use a sliding window (`left` and `right` pointers) to expand and contract the window.
    - Maintain a frequency map to track character occurrences within the window.
    - When all unique characters are present, try shrinking the window from the left
      to find the minimum length.
    - The time complexity is O(N), where N is the length of `s`, since each character
      is processed at most twice.
    */

    public int findSubString(String s) {
        int n = s.length();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) uniqueChars.add(c);
        int required = uniqueChars.size();

        Map<Character, Integer> windowFreq = new HashMap<>();
        int left = 0, right = 0, formed = 0, minLength = Integer.MAX_VALUE;

        while (right < n) {
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
            if (windowFreq.get(c) == 1) formed++;

            while (formed == required) {
                minLength = Math.min(minLength, right - left + 1);
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (windowFreq.get(leftChar) == 0) formed--;
                left++;
            }
            right++;
        }
        return minLength;
    }
}
