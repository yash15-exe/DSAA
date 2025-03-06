package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashMap;

public class SubstringOfSizeThreeWithDistinctChars {
    /*
    Problem Summary:
    Given a string `s`, find the number of substrings of length 3 that contain all distinct characters.

    Implementation Approach:
    - Use a sliding window of size 3 to track character frequencies.
    - Start by adding the first 3 characters to a HashMap.
    - If the map size is 3, increment the count.
    - Move the window forward, adding the new character and removing the leftmost one.
    - If the updated window still has 3 unique characters, increase the count.
    - The time complexity is O(N) as each character is processed once.
    */

    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0; // Edge case: If string length is less than 3, return 0.

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        // Initialize the first window of size 3
        for (int i = 0; i < 3; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (map.size() == 3) count++;

        // Slide the window across the string
        for (int i = 3; i < s.length(); i++) {
            if (map.size() == 3) count++; // If the window contains 3 unique characters, increase count.

            // Add the new character to the map
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            // Remove the leftmost character from the map
            char leftChar = s.charAt(i - 3);
            map.put(leftChar, map.get(leftChar) - 1);
            if (map.get(leftChar) == 0) {
                map.remove(leftChar); // Remove character completely if its frequency is 0.
            }
        }

        return count;
    }
}
