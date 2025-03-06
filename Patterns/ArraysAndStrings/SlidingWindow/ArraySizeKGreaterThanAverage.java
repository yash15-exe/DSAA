package Patterns.ArraysAndStrings.SlidingWindow;
// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

/*
 * 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * Given an integer array arr, an integer k, and an integer threshold,
 * return the number of contiguous subarrays of size k whose average is ≥ threshold.
 */

public class ArraySizeKGreaterThanAverage {

    /*
     * Approach: Sliding Window
     * - Compute sum of first `k` elements.
     * - Slide the window across the array:
     *   - Remove the leftmost element.
     *   - Add the next element in the array.
     *   - Check if the sum is ≥ `k * threshold`.
     *
     * Time Complexity: O(N)  (Each element is processed once)
     * Space Complexity: O(1) (Only a few integer variables used)
     */

    public int numOfSubArrays(int[] arr, int k, int threshold) {
        int sum = 0, count = 0;
        int target = k * threshold;

        // Compute initial sum for the first window of size `k`
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Check the first window
        if (sum >= target) count++;

        // Slide the window
        for (int r = k; r < arr.length; r++) {
            sum += arr[r] - arr[r - k]; // Add new element, remove old
            if (sum >= target) count++; // Check condition
        }

        return count;
    }
}
-