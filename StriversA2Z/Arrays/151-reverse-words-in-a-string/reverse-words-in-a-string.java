class Solution {
    public String reverseWords(String s) {
      
        String[] words = s.split(" ");
        StringBuilder stringToReturn = new StringBuilder();
        
      
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) { 
                stringToReturn.append(words[i]).append(" ");
            }
        }
        
      
        return stringToReturn.toString().trim();
    }
}
