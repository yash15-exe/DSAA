package Patterns.ArraysAndStrings.TwoPointers;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum {

    /*
     * Approach: Two-Pointer Technique
     * - Since the array is sorted, use a two-pointer method.
     * - Start one pointer (`i`) from the beginning and another (`j`) from the end.
     * - If `numbers[i] + numbers[j] == target`, return `{i+1, j+1}` (1-based index).
     * - If the sum is greater than `target`, move `j` left.
     * - If the sum is smaller than `target`, move `i` right.
     * - Guaranteed to find a solution as per problem constraints.
     *
     * Time Complexity: O(N)  (Single pass)
     * Space Complexity: O(1) (In-place computation)
     */

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1}; // Return 1-based indices
            } else if (sum > target) {
                j--; // Move `j` left to decrease sum
            } else {
                i++; // Move `i` right to increase sum
            }
        }
        return new int[]{-1, -1}; // Should never reach here per problem constraints
    }
}
