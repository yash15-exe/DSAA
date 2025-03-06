package Patterns.ArraysAndStrings.BinarySearchOnAnswer;
// A peak element in an array is an element that is greater than or equal to its neighbors.
// In an unsorted array, a peak element can be found using a linear search (O(n)) or
// an optimized binary search approach (O(log n)).
//https://leetcode.com/problems/find-peak-element/
public class PeakElement {

    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}


