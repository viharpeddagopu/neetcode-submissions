class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            //skip the duplicate
            if(i > 0 &&  nums[i]==nums[i-1])
                continue;

            //we have our a value, now implement 2sum using left & right pointer
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            //2sum-ii
            while(left < right){
                int currSum = nums[left] + nums[right];

                if(currSum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    //skip the subsequent duplicates too
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                }
                if(currSum < target) left++;
                if(currSum > target) right--;
            }
        }
        return result;
    }
}
