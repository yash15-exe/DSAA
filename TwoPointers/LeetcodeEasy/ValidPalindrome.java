package TwoPointers.LeetcodeEasy;

public class ValidPalindrome {

//    public boolean isPalindrome(String s) {
//        StringBuilder stringToEvaluate = new StringBuilder();
//        String[] string = s.split("");
//        for(String str:string){
//            str = str.toLowerCase();
//            if(str.matches("[a-z0-9]+"))stringToEvaluate.append(str);
//
//
//        }
//        for (int i = 0; i < stringToEvaluate.length()/2; i++) {
//            if(stringToEvaluate.charAt(i)!=stringToEvaluate.charAt(stringToEvaluate.length()-i-1)){
//                return false;
//            }
//        }
//        return true;
//    }
    public boolean isPalindrome(String s){
        int i = 0;

        int j = s.length()-1;
        while(i<j){
           if(!Character.isLetterOrDigit(s.charAt(i))) {
               i++;
               continue;
           }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
