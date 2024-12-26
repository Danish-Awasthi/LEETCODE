class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    public int helper(int[] arr,int target,int idx,int sum){
        if(idx>=arr.length){
            if(sum==target) return 1;
            return 0;
        }
        int subtract=helper(arr,target,idx+1,sum-arr[idx]);
        int add=helper(arr,target,idx+1,sum+arr[idx]);
        return subtract+add;
    }
}