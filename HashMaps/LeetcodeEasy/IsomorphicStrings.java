package HashMaps.LeetcodeEasy;
import  java.util.*;
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> charMap = new HashMap<>();

        HashSet<Character> mappedChars = new HashSet<>();


        if (s.length() != t.length()) {
            return false;
        }


        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);


            if (!charMap.containsKey(sChar)) {

                if (mappedChars.contains(tChar)) {
                    return false;
                }

                charMap.put(sChar, tChar);

                mappedChars.add(tChar);
            } else {

                if (charMap.get(sChar) != tChar) {
                    return false;
                }
            }
        }

        return true;
    }
}
