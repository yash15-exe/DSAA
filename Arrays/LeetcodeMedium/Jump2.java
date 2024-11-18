package Arrays.LeetcodeMedium;

public class Jump2 {
    public int jump(int[] nums) {
        // int index = 0;
        // int jumps = 0;
        // if(nums[0]==0)return 0;

        // while(index < nums.length){
        //     int longestJump = 0;
        //     int longestJumpIndex = 0;
        //     for(int j = 1; j <= nums[index]; j++){
        //         if(j+index>nums.length-1)return jumps;
        //         if(nums[j+index]+index>longestJump){
        //             longestJump = nums[j+index]+index;
        //             longestJumpIndex = index+j;
        //         }
        //     }
        //     index = longestJumpIndex;
        //     jumps++;
        // }
        // return jumps;

        if (nums.length <= 1) return 0;

        int farthestIndex = 0;
        int currentEnd = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthestIndex = Math.max(farthestIndex, i + nums[i]);


            if (i == currentEnd) {
                jumps++;
                currentEnd = farthestIndex;


                if (currentEnd >= nums.length - 1) break;
            }
        }

        return jumps;
    }
}
