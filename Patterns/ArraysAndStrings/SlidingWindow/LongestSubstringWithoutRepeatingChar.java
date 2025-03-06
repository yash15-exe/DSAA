package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    /*
    Problem Summary:
    Given a string `s`, find the length of the longest contiguous substring
    that does not contain repeating characters.

    Implementation Approach:
    - We use a sliding window with two pointers (`l` and `r`).
    - A HashSet is used to track characters in the current window.
    - Expand the window (`r` pointer) by adding characters until a duplicate is found.
    - When a duplicate is encountered, shrink the window from the left (`l`) until it is unique again.
    - Maintain and update the maximum length found.
    - This approach runs in O(N) time complexity, where N is the length of `s`.
    */

    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, length = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
                length--;
            } else {
                set.add(s.charAt(r));
                length++;
                r++;
            }
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}
