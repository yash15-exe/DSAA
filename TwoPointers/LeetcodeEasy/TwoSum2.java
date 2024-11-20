package TwoPointers.LeetcodeEasy;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target)break;
            if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }


        }
        return new int[]{i+1,j+1};
    }
}
