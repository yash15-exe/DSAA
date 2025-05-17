class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        int maxCount = count;
        
        for(int i = k; i < s.length(); i++){
            if(set.contains(s.charAt(i-k))){
                count--;
            }
            if(set.contains(s.charAt(i))){
                count++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}