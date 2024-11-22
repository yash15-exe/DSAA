package HashMaps.LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] stringArray = s.split(" ");
        if(pattern.length()!=stringArray.length)return false;
        for (int i = 0; i < stringArray.length; i++) {
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(stringArray[i]))return false;
                map.put(pattern.charAt(i),stringArray[i]);
            }
            else{
                if(!Objects.equals(stringArray[i], map.get(pattern.charAt(i)))){
                    return false;
                }
            }

        }
        return true;
    }
}
