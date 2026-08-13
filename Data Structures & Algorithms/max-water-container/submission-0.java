class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = 0, maxArea = 0;

        while(left < right){
            area = Math.min(heights[left], heights[right]) * (right - left);

            if(heights[left] > heights[right]){
                right--;
            }
            else{
                left++;
            }

            maxArea  = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
