package Arrays.Easy;

public class PalindromicArray {
    public static boolean palinArray(int[] arr) {
        for(int num: arr){
            String numsString = Integer.toString(num);
            for (int i = 0; i < numsString.length()/2; i++) {
                if(numsString.charAt(i)!=numsString.charAt(numsString.length()-1-i)){
                    return false;
                }
            }
        }
        return true;
    }
}
