public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start j from i+1 to avoid duplicate indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return indices of the two numbers
                }
            }

        }
        return new int[0];
    }

}