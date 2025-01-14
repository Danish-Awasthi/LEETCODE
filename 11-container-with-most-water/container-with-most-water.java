class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1; int maxArea=0;
        while(i<j){
            int currArea= Math.min(height[i],height[j])*(j-i);
            maxArea=Math.max(maxArea,currArea);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return maxArea;
    }
}