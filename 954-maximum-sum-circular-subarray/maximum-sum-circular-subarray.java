class Solution {
    public int kadane(int[] nums){
        int maxSoFar=nums[0];
        int maxEnd=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnd=Math.max(nums[i],maxEnd+nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEnd);
        }
        return maxSoFar;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int kmax=kadane(nums);
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
            nums[i]=-nums[i];
        }
        int kmin=kadane(nums);
        if(kmax<0) return kmax;
        else return Math.max(kmax,tsum+kmin);
    }
}