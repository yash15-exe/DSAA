package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.ArrayList;

public class SumOfSubArrayEqualsK {
    /*
    Problem Summary:
    Given an array `arr` and a target sum `K`, find the starting and ending positions
    (1-based index) of the first contiguous subarray whose sum equals `K`.
    If no such subarray exists, return [-1].

    Implementation Approach:
    - Use a sliding window approach with two pointers `l` (left) and `r` (right).
    - Expand the window by adding `arr[r]` to `sum`.
    - If `sum` exceeds `K`, shrink the window by moving `l` to the right.
    - If `sum` matches `K`, return the (1-based) indices `[l+1, r+1]`.
    - If no valid subarray is found, return `[-1]`.
    - This approach runs in O(N) time complexity.
    */

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0, r = 0, sum = 0;

        while (r < arr.length) {
            sum += arr[r];

            // Shrink the window if the sum exceeds the target
            while (sum > target && l < r) {
                sum -= arr[l];
                l++;
            }

            // Check if the current sum matches the target
            if (sum == target) {
                list.add(l + 1); // Convert 0-based index to 1-based
                list.add(r + 1);
                return list;
            }
            r++;
        }

        list.add(-1); // No valid subarray found
        return list;
    }
}
