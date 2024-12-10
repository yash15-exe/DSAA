package BitManipulation;

public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0, threes;

        for (int num : nums) {

            twos |= ones & num;

            ones ^= num;

            threes = ones & twos;

            ones &= ~threes;
            twos &= ~threes;
        }

        return ones;
    }
}
