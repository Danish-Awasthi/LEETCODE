class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0,sum=0;
        Map<Integer,Integer> mp =new HashMap<>();
        mp.put(0,1);
        for(int num:nums){
            sum+=num;
            int rem=((sum%k)+k)%k;
            if(mp.containsKey(rem)) 
            {
                count+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}