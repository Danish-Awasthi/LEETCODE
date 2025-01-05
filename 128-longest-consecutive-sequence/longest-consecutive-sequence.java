class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int ccount=1;
                while(set.contains(curr+1)){
                    ccount++;
                    curr++;
                }
                count=Math.max(count,ccount);
            }
        }
        return count;
    }
}