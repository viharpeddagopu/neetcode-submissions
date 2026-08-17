class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int m = l + (r - l)/2;

            if(target == nums[m])
                return m;
            
            //check if left is sorted
            if(nums[m] >= nums[l]){ //sorted
                if(target >= nums[l] && target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
            else{ //right half sorted
                //check if present at right
                if(target > nums[m] && target <= nums[r])
                    l = m +1;
                else
                    r = m -1;
            }
        }
        return -1;
    }
}
