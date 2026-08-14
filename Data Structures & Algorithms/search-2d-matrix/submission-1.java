//using 2 matrix as 1d matrix
//row = mid/cols
//col = mid%cols
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int l=0, r=(rows*cols)-1; //r-> last index of matrix

        while(l <= r){
            int mid = l + (r - l)/2;

            if(target == matrix[mid/cols][mid%cols])
                return true;
            else if(target > matrix[mid/cols][mid%cols])
                l = mid +1;
            else
                r = mid - 1;
        }
        return false;
    }
}
