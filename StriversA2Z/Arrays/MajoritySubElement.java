package StriversA2Z.Arrays;

public class MajoritySubElement {
    /*
Question ID: 169  (Replace with actual ID if available)
https://leetcode.com/problems/majority-element/description/
Question: Given an integer array `nums[]`, find the **majority element**.
A majority element is an element that appears **more than ⌊n / 2⌋ times** in the array.
It is guaranteed that such an element always exists.

Explanation:
- We use **Boyer-Moore Voting Algorithm**, which runs in **O(n) time and O(1) space**.
- Maintain a `candidate` element and a `count`:
  1. If `count == 0`, set the `candidate` to the current element.
  2. If the current element is the `candidate`, increase `count`.
  3. Otherwise, decrease `count`.
- Since the majority element always exists, it will remain as the final `candidate`.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
*/

    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for(int i : nums){
            if(count == 0){
                candidate = i;
                count++;
            } else {
                if(candidate == i) count++;
                else count--;
            }
        }
        return candidate;
    }

}
