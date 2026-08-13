class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // left product
        result[0] = 1;
        for (int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // right product
        int right = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);

        for (int num : result){
            System.out.print(num + " ");
        }
    }
}  
