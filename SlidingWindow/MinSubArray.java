package SlidingWindow;

public class MinSubArray {
//    public int minSubArrayLen(int target, int[] nums) {
//
//        int maxLength = nums.length;
//
//        for (int i = 0; i < nums.length; i++) {
//            int j = 0;
//            int maxSum = 0;
//            while(j<maxLength&&i+j<nums.length){
//                maxSum+=nums[j+i];
//                if(maxSum>target){
//                    maxLength = j;
//
//                    break;
//                }
//                j++;
//            }
//            if(maxSum<target&&i==nums.length-1&&maxLength==nums.length)return 0;
//
//        }
//
//        return maxLength;
//    }


    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE; // Smallest subarray length
        int left = 0;                      // Start of the sliding window
        int currentSum = 0;                // Sum of the current window

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];     // Expand the window

            // Shrink the window while the sum is greater than or equal to the target
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left]; // Shrink from the left
                left++;
            }
        }

        // If minLength was not updated, no valid subarray was found
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

}
