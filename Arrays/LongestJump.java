package Arrays;

public class LongestJump {
    public boolean canJump(int[] nums) {
        int i = 0;
        int fuel = nums[0];

        while (i < nums.length && fuel >= i) {
            if (i == nums.length - 1) {

                return true;
            }

            fuel = Math.max(fuel, nums[i] + i);

            i++;
        }

        return false;
    }
}
