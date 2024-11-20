package TwoPointers.LeetcodeEasy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        if(s.isEmpty()){
            return true;
        }
        for(char c: t.toCharArray()){
            if(c == s.charAt(i)){
                i++;
            }
            if(i > s.length()-1)return true;
        }
        return false;
    }
}
