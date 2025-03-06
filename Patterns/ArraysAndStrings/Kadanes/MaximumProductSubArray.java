package Patterns.ArraysAndStrings.Kadanes;

public class MaximumProductSubArray {

    /*
    Approach: First is using mere observation. We can see that there are three cases which are possible
    1. All Positive numbers-just multiply all of them
    2. All Even Negatives-Just multiply all of them
    3. Odd negatives-The odd even divide the array into a prefix and a suffix. As the negatives are dividing the array, either part of array will only contain even number of negatives.
    4. There are zeros-If zero is encountered, reset the product to zero

    It can be observed that as the arrays are getting divided in prefix and suffix, the answer can be maximum from the prefix, or it can be maximum from the suffix.

    Ex: [10, -2, 4, -6, 9,       -4,       2, 4 ]

    Hence, we keep track of max on prefix as well as on the suffix part.
     */
    public int maxProduct1(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-1-i];
            max = Math.max(prefix, max);
            max = Math.max(suffix, max);
            if(nums[i] == 0)prefix = 1;
            if(nums[nums.length-1-i]==0)suffix = 1;
        }
        return max;
    }



// Intuition: This is a modified Kadane’s algorithm for maximum product subarray.
// Since multiplying a negative number can flip min to max, we track both max and min.
// At each step, we update max and min based on the current number, max * num, and min * num.
// The result stores the maximum product found so far.

    public int maxProduct2(int[] nums) {
        if (nums.length == 1) return nums[0];

        int res = nums[0];
        int max = 1;
        int min = 1;

        for (int n : nums) {
            int tmp = max * n;
            max = Math.max(n, Math.max(tmp, min * n));
            min = Math.min(n, Math.min(tmp, min * n));
            res = Math.max(res, max);
        }
        return res;
    }





}
