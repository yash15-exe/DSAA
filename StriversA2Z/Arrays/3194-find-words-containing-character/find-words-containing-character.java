class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int index = 0;
        List<Integer> ans = new ArrayList<>();
        for(String word: words){
            for(char ch: word.toCharArray()){
                if(ch == x){
                    ans.add(index);
                    break;
                }
            }
            index++;
        }
        return ans;
    }
}