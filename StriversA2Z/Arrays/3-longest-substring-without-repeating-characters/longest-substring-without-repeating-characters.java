class Solution {
     public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int length = 0;
        int maxLength = 0;
        HashSet <Character> set = new HashSet<>();
        while(r<s.length()){
           
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
                length--;
            }else{
                set.add(s.charAt(r));
                length ++;
                r++;
            }
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}