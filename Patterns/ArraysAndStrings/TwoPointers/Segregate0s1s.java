package Patterns.ArraysAndStrings.TwoPointers;
// https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

public class Segregate0s1s {

    /*
     * Approach: Two-Pointer Technique
     * - Use two pointers (`i` and `j`), one starting from the left and the other from the right.
     * - Move `i` forward while it points to 0.
     * - Move `j` backward while it points to 1.
     * - If `arr[i] == 1` and `arr[j] == 0`, swap them.
     * - Stop when `i >= j`.
     *
     * Time Complexity: O(N)  (Single pass)
     * Space Complexity: O(1) (In-place swapping)
     */

    void segregate0and1(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            // Move i forward if it's already 0
            if (arr[i] == 0) {
                i++;
            }
            // Move j backward if it's already 1
            else if (arr[j] == 1) {
                j--;
            }
            // Swap when arr[i] is 1 and arr[j] is 0
            else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}
