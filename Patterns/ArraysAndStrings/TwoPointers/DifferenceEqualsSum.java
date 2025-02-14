package Patterns.ArraysAndStrings.TwoPointers;
//https://www.interviewbit.com/problems/pair-with-given-difference/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DifferenceEqualsSum {

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
