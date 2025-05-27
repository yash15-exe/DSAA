class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }
        for(String word: words){
            boolean valid = true;
            for(int i = 0; i < word.length(); i++){
                if(!set.contains(word.charAt(i))){valid = false;
                break;
                }
            }
            if(valid)count++;
        }
        return count;
    }
}