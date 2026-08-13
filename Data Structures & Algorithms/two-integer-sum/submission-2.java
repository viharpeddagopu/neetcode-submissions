class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map stores: <Number Value, Index>
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the map's keys contain the number we need
            if (map.containsKey(complement)) {
                // Return the index of the previously seen number, then the current index
                return new int[]{map.get(complement), i};
            }

            // Put the NUMBER as the key, and the INDEX as the value
            map.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
}