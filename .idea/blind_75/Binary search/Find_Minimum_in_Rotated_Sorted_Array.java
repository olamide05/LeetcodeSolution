class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2; // Corrected middle index calculation

            if (nums[m] > nums[r]) {
                // The minimum must be in the right half
                l = m + 1;
            } else {
                // The minimum might be at m or in the left half
                r = m;
            }
        }

        return nums[l];

    }
}
