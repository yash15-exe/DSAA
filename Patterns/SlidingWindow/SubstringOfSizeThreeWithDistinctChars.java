package Patterns.SlidingWindow;

import java.util.HashMap;

public class SubstringOfSizeThreeWithDistinctChars {

    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < 3; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==3) count++;
        for(int i = 3; i < s.length(); i++){
            if(map.size()==3) count++;
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            map.put(s.charAt(i-3), map.get(s.charAt(i-3))-1);
            if(map.get(s.charAt(i-3))==0){
                map.remove(s.charAt(i-3));
            }
        }

        return count;
    }
}
