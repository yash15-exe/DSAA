package Arrays;

import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return false;
        }
        int i = 0;
        for(char c: t.toCharArray()){
            if(c == s.charAt(i)){
                i++;
            }
            if(i == s.length()-1)return true;
        }
        return false;
    }
}




