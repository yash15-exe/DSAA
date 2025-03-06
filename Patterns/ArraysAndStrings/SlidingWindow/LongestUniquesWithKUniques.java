package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashMap;

public class LongestUniquesWithKUniques {
    /*
    Problem Summary:
    Given a string `s` and an integer `k`, find the length of the longest
    substring that contains exactly `k` unique characters.
    If no such substring exists, return -1.

    Implementation Approach:
    - We use a sliding window with two pointers (`l` and `r`).
    - A HashMap keeps track of character frequencies in the current window.
    - Expand the window (`r` pointer) while adding characters.
    - If the number of unique characters exceeds `k`, shrink the window (`l`)
      until exactly `k` unique characters remain.
    - Track and update the maximum length found when the window contains exactly `k` unique characters.
    - If no valid substring is found, return -1.
    - The time complexity is O(N), where N is the length of `s`.
    */

    public int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, n = s.length(), maxLength = 0;

        while (r < n) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            while (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }

            if (map.size() == k) maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return map.size() < k ? -1 : maxLength;
    }
}
