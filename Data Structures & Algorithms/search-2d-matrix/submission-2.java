class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0, bot = row-1, targetrow = -1;

        while(top <= bot){
            int mid = top + (bot - top)/2;
            if(target > matrix[mid][col-1])
                top = mid + 1;
            else if(target < matrix[mid][0])
                bot = mid - 1;
            else{
                targetrow = mid;
                break;
            }
        }

        if(targetrow == -1) return false;

        int l = 0, r = col -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(target == matrix[targetrow][mid])
                return true;
            else if(target > matrix[targetrow][mid])
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}
