class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int Maxi=nums[0];
        for(int num:nums){
            sum+=num;
            Maxi = Math.max(Maxi, sum);
            if(sum<0){
                sum=0;
            }
        }
        return Maxi;
    }
}