package String.Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder LCP = new StringBuilder();
        String shortest = strs[0];
        for(String str: strs){
            if(str.length()<shortest.length())shortest=str;
        }
        for (int i = 0; i < shortest.length(); i++) {
            boolean shouldContinue = true;
            char chr = shortest.charAt(i);
            for(String str: strs){
                if (str.charAt(i)!=chr){
                    shouldContinue = false;
                    break;
                }
            }
            if(!shouldContinue){
                break;
            }
            LCP.append(chr);

        }
        return LCP.toString();
    }
}
