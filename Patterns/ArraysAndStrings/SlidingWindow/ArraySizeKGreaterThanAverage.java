package Patterns.ArraysAndStrings.SlidingWindow;
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
/*
1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
*Given an array of integers arr and two integers k and threshold,
* return the number of sub-arrays of size k and average greater than or equal to threshold.
*/
public class ArraySizeKGreaterThanAverage {
    public int numOfSubArrays(int[] arr, int k, int threshold) {
        int sum = 0, count = 0;


        int target = k * threshold;
    /*You need to find subarrays of length k.
    The average of each subarray must be at least threshold.
    Since average = sum / k, the sum of each subarray must be at least k * threshold to satisfy this condition.
    */
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= target)
            count++;

        for (int r = k; r < arr.length; r++) {
            sum += arr[r] - arr[r - k];
            if (sum >= target)
                count++;
        }

        return count;
    }
}
