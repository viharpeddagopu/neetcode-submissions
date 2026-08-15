class Solution {
    public int findMin(int[] nums) {
        // Handle null/empty edge cases first
        if (nums == null || nums.length == 0) return -1;
        
        int l = 0, r = nums.length - 1;

        // Use l < r because we are converging on a single point (r = m)
        while (l < r) {
            int m = l + (r - l) / 2;

            if (nums[m] > nums[r]) {
                // The drop-off is to the right
                l = m + 1;
            } else {
                // The right side is sorted, so the min is at m or to the left
                r = m;
            }
        }
        
        // When the loop breaks (l == r), we have converged on the minimum!
        return nums[l];
    }
}