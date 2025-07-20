class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];  // Calculate needed value
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == remaining) {
                    return new int[]{i, j};  // Return indices of the two numbers
                }
            }
        }
        return new int[]{}; // In case no pair is found
    }
}
