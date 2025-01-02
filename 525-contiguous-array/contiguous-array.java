class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen=0,zeros=0,ones=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            else ones++;
            int diff=zeros-ones;
            if(mp.containsKey(diff)){
                maxLen=Math.max(maxLen,i-mp.get(diff));
            }
            else{
                mp.put(diff,i);
            }
        }
        return maxLen;
    }
}