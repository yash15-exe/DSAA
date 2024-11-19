package Arrays.LeetcodeMedium;

public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) prefix *= nums[i - 1];
            prefixArray[i] = prefix;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1) suffix *= nums[i + 1];
            suffixArray[i] = suffix;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefixArray[i] * suffixArray[i];
        }

        return nums;
    }
}
