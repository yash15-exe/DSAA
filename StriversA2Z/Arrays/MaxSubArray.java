package StriversA2Z.Arrays;

public class MaxSubArray {
    /*
Question ID: 53  (Replace with actual ID if available)
https://leetcode.com/problems/maximum-subarray/
Question: Given an integer array `nums[]`, find the **maximum sum of a contiguous subarray** (at least one element).
This problem is also known as **Kadane’s Algorithm**.

Explanation:
- Initialize `sum` as 0 and `maxSum` as the smallest possible integer.
- Traverse through `nums`:
  1. Add the current element to `sum`.
  2. Update `maxSum` with the maximum value between `maxSum` and `sum`.
  3. If `sum` becomes negative, reset it to 0 (as a negative sum will only decrease future subarrays).
- Return `maxSum`, which stores the largest possible subarray sum.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
*/

    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int i : nums){
            sum += i;
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }

}
