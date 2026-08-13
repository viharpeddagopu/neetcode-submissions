class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 0; i<n; i++){
            int index = binarySearch(numbers, target - numbers[i], i);
            if(index != -1){
                return new int[]{i+1, index+1};
            }
        }
        return new int[]{-1,-1};
    }
    public int binarySearch(int[] numbers, int target, int i){
        int left = i+1;
        int right = numbers.length-1;
        int mid = -1;

        while(left <= right){
            mid = (right - left)/2 + left;

            if(numbers[mid] == target)
                return mid;

            else if(numbers[mid] > target)
                right= mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}
