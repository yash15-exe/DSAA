class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxLen = 0;
        int zeros = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}
