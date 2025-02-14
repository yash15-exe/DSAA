package Patterns.ArraysAndStrings.TwoPointers;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;

        while(i<j){
            if(numbers[i]+numbers[j]==target)return new int[]{i+1, j+1};
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{i, j};
    }
}
