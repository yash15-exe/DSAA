package StriversA2Z.Arrays;

public class MaximumScoreFromSubArraysMinimums {

    /*
Question ID:   (Replace with actual ID if available)
https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category
Question: Given an array `arr[]`, find the maximum sum of any two adjacent elements in the array.

Explanation:
- Initialize `max` with the smallest possible integer value.
- Iterate through the array from index `0` to `n-2` (to avoid out-of-bounds).
- For each index `i`, calculate the sum of `arr[i] + arr[i+1]` (adjacent elements).
- Update `max` if the current sum is greater than the stored `max` value.
- Finally, return the maximum sum found.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
*/

    public int pairWithMaxSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            max = Math.max(arr[i] + arr[i+1], max);
        }
        return max;
    }

}
