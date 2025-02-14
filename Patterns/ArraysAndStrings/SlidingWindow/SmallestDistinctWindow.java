package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestDistinctWindow {
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
