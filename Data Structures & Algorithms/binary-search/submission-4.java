class Solution {
    // 1. The main method just kicks off the recursion with the initial bounds
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    // 2. The recursive helper method
    private int helper(int[] nums, int target, int l, int r) {
        // Base Case 1: The pointers crossed, meaning the target isn't here
        if (l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;

        // Base Case 2: We found the target!
        if (nums[mid] == target) {
            return mid;
        } 
        
        // Recursive Step 1: Target is smaller, search the left half
        else if (target < nums[mid]) {
            // Notice how we pass 'mid - 1' instead of doing r = mid - 1
            return helper(nums, target, l, mid - 1);
        } 
        
        // Recursive Step 2: Target is larger, search the right half
        else {
            // Notice how we pass 'mid + 1' instead of doing l = mid + 1
            return helper(nums, target, mid + 1, r);
        }
    }
}