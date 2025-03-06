package Patterns.ArraysAndStrings.TwoPointers;
// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/

import java.util.ArrayList;

public class RemoveDuplicate {

    /*
     * Approach:
     * - Use two pointers: `i` (slow pointer) and `j` (fast pointer).
     * - `i` tracks the position of the last unique element.
     * - `j` iterates through the array, skipping duplicates.
     * - When a new unique element is found, move it to index `i+1`.
     * - Finally, return `i+1`, which represents the number of unique elements.
     *
     * Time Complexity: O(N) (Single pass through the array)
     * Space Complexity: O(1) (In-place modification)
     */

    public int removeDuplicates(ArrayList<Integer> a) {
        if (a.isEmpty()) return 0;

        int i = 0; // Slow pointer for unique elements

        for (int j = 1; j < a.size(); j++) {
            if (!a.get(i).equals(a.get(j))) { // Found a new unique element
                i++; // Move slow pointer
                a.set(i, a.get(j)); // Update next position with unique element
            }
        }

        return i + 1; // Number of unique elements
    }
}
