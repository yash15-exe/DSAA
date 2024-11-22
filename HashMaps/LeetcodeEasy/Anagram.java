package HashMaps.LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)&&map.get(ch)>0){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
