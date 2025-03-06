package Patterns.ArraysAndStrings.TwoPointers;
//https://www.interviewbit.com/problems/pair-with-given-difference/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DifferenceEqualsSum {
    /*
     * Using Sorting and Two Pointers (O(n log n) time complexity, O(1) space complexity):
     * - First, we sort the array to bring order.
     * - We use two pointers: one at the start (i) and one at the end (j).
     * - We check if the difference between A[j] and A[i] equals B.
     * - If the difference is greater than B, we move j left to decrease it.
     * - If the difference is smaller, we move i right to increase it.
     * - This ensures we efficiently find a valid pair if it exists.
     */
    //using constant space and sorting O(n logn)
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i = 0, j = A.size()-1;

        while(i<j){
            if(A.get(j)-A.get(i)==B){
                return 1;
            }
            if(A.get(j)-A.get(i)>B){
                j--;
            }
            else{
                i++;
            }
        }
        return 0;
    }
    /*
     * Using HashSet for O(N) time complexity and O(N) space complexity:
     * - We iterate through the array while storing elements in a HashSet.
     * - For each element, we check if (num - B) or (num + B) is already in the set.
     * - If found, it means there exists a pair with the required difference.
     * - This approach eliminates the need for sorting and provides an optimal solution.
     */
    //using hashset, O(N)
    public int solve1(ArrayList<Integer> A, int B) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : A) {
            // Check if we already have a number such that their difference is B
            if (seen.contains(num - B) || seen.contains(num + B)) {
                return 1;
            }
            seen.add(num);
        }

        return 0;
    }

}
