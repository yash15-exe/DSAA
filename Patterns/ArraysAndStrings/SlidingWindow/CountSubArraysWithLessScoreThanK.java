package Patterns.ArraysAndStrings.SlidingWindow;

public class CountSubArraysWithLessScoreThanK {
    /*
    Problem Summary:
    Given an array `nums` and an integer `k`, we need to count the number of contiguous subarrays
    where the score (sum of elements * subarray length) is less than `k`.

    Implementation Approach:
    - We use a sliding window technique with two pointers (`l` and `r`).
    - The right pointer (`r`) expands the window by adding `nums[r]` to the sum.
    - If the score condition (sum * window size) is violated, we shrink the window from the left (`l`).
    - Each valid window contributes `(r - l + 1)` subarrays to the count.
    - This optimized approach runs in O(N) time complexity.
    */

    public long countSubarrays(int[] nums, long k) {
        int n = nums.length, l = 0;
        long sum = 0, count = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum * (r - l + 1) >= k) {
                sum -= nums[l];
                l++;
            }

            count += (r - l + 1);
        }

        return count;
    }
}
