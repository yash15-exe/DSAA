package Patterns.ArraysAndStrings.SlidingWindow;

public class CountSubArraysWithLessScoreThanK {
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
