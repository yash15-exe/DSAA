package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class longestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        Set<Character> set = new HashSet<>();
        int longestLength = 1;
        int r = 0;
        int l = 0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            else{
                if(l>=r)break;
                set.remove(s.charAt(l));
                l++;

            }
            longestLength = Math.max(longestLength, r - l);
        }
        return longestLength;
    }
}
