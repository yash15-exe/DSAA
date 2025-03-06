package Patterns.ArraysAndStrings.TwoPointers;
// https://www.geeksforgeeks.org/problems/equal-to-product3836/1

import java.util.Arrays;
import java.util.HashSet;

public class ProductPair {

    /*
     * Problem Statement:
     * - Given an array of integers and a target value `x`, check if there exists a pair (i, j)
     *   such that arr[i] * arr[j] == x.
     * - Return `true` if such a pair exists, otherwise return `false`.
     *
     * Constraints:
     * - The elements in the array can be positive or negative.
     * - The same element can be used more than once if needed.
     */

    /*
     * Approach 1: Using HashSet (O(N) time, O(N) space)
     * - We store all elements in a HashSet for quick lookups.
     * - For each element arr[i], check if (x / arr[i]) exists in the set.
     * - If found, return true; otherwise, continue searching.
     * - Edge cases handled: If `x` is 0, we must check if there's at least one 0 in the array.
     */
    boolean isProduct(int[] arr, long x) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (x % arr[i] == 0 && set.contains((int) (x / arr[i]))) {
                return true;
            }
        }
        return false;
    }

    /*
     * Approach 2: Using Sorting and Two Pointers (O(N log N) time, O(1) space)
     * - Sort the array to allow an ordered approach.
     * - Use two pointers: one at the start (i) and one at the end (j).
     * - If arr[i] * arr[j] == x, return true.
     * - If the product is smaller than x, move i to the right to increase the product.
     * - If the product is greater than x, move j to the left to decrease the product.
     * - This approach is efficient in terms of space but requires sorting.
     */
    boolean isProduct1(int[] arr, long x) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            long product = (long) arr[i] * arr[j];
            if (product == x) {
                return true;
            }
            if (product < x) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
