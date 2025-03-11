package StriversA2Z.Arrays;

public class SortColors {
/*
Question ID: 75  (Replace with actual ID if available)
https://leetcode.com/problems/sort-colors/
Question: Given an array `nums[]` containing **only** values `{0, 1, 2}`, sort the array **in-place** so that:
- All 0s appear first
- All 1s appear next
- All 2s appear last

Explanation:
- We use **Dutch National Flag Algorithm** (Three-Pointer Approach).
- Maintain three pointers:
  1. `l` (left) → Boundary for 0s.
  2. `r` (right) → Boundary for 2s.
  3. `i` → Current element being checked.
- If `nums[i] == 2`, swap `nums[i]` with `nums[r]` and decrement `r`.
- If `nums[i] == 0`, swap `nums[i]` with `nums[l]`, increment `l` and `i`.
- If `nums[i] == 1`, simply move `i` forward.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
*/

    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1, i = 0;
        while (i <= r) {
            if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
            } else if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
                i++;
            } else {
                i++;
            }
        }
    }

    // Helper method to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}