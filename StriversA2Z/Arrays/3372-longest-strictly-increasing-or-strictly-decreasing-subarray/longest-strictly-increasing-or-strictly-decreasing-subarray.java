public class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int incLen = 1, decLen = 1;
        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                incLen++;
                decLen = 1;
            } else if (nums[i] < nums[i - 1]) {
                decLen++;
                incLen = 1;
            } else {
                incLen = decLen = 1;
            }
            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }

        return maxLen;
    }
}
