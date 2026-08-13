class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int result = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int sum = 1;
                int current = num;

                while(set.contains(current+1)){
                    sum++;
                    current++;
                }
                
                result = Math.max(sum, result);
            }
        }
        return result;
    }
}
