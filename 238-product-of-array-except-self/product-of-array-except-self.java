class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1]*left[i-1];
            right[nums.length-i-1]=nums[nums.length-i]*right[nums.length-i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}