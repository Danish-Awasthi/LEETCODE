class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=nums[i];
        }
        double max=curr;
        for(int i=k;i<nums.length;i++){
            curr=curr-nums[i-k]+nums[i];
            if(curr>max){
                max=curr;
            }
        }
        return max/(double)k;
    }
}