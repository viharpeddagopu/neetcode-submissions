class Solution {
    public int[] productExceptSelf(int[] nums) {
        //we can use the division operator here becuase there is a problem with the 0. case

        //use prefix and postfix product

        int[] output = new int[nums.length];
        int prefix = 1, postfix = 1;

        for(int i = 0; i<nums.length; i++){
            output[i] = prefix;
            prefix = prefix * nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--){
            output[i] = output[i] * postfix;
            postfix = postfix * nums[i];
        }
        return output;
    }
}  
