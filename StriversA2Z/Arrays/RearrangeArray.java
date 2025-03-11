package StriversA2Z.Arrays;

public class RearrangeArray {
    /*
Question ID: 2149  (Replace with actual ID if available)
Question: Given an array `nums` consisting of an equal number of positive and negative integers, rearrange the array such that every positive number is followed by a negative number in an alternating manner while maintaining their relative order.
https://leetcode.com/problems/rearrange-array-elements-by-sign/
Explanation:
- We use two pointers: `positive` to track the next positive number and `negative` to track the next negative number.
- We iterate through the array in steps of 2 (`i = i+2`), placing a positive number at `ans[i]` and a negative number at `ans[i+1]`.
- To find the next positive and negative number, we increment the respective pointers while skipping invalid elements.
- Finally, we return the modified array.

Expected Time Complexity: O(n)
Expected Space Complexity: O(n)
*/

    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length-1; i = i+2){
            while(nums[positive] < 0){
                positive++;
            }
            while(nums[negative] > 0){
                negative++;
            }
            ans[i] = nums[positive];
            ans[i+1] = nums[negative];
            positive++;
            negative++;
        }
        return ans;
    }

}
