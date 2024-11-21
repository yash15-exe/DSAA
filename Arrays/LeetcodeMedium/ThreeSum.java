package Arrays.LeetcodeMedium;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to enable the two-pointer technique
        Arrays.sort(nums);

        // Iterate through the array, treating each element as the first in the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two-pointer approach for the remaining two elements
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];  // We need nums[left] + nums[right] to equal -nums[i]

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;  // If sum is too small, move the left pointer to the right
                } else {
                    right--;  // If sum is too large, move the right pointer to the left
                }
            }
        }

        return result;
    }
}
