class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int curSum = 0;

        while(left < right){
            curSum = numbers[left]+numbers[right];

            if(curSum > target)
                right -= 1;
            else if(curSum < target)
                left += 1;
            else
                return new int[]{left + 1, right + 1};
        }
        return new int[]{-1, -1};
    }
}
