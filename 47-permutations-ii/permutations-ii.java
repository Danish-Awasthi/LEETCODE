class Solution {
     public void Perm(int[] nums,List<Integer>ds,List<List<Integer>>ans,boolean[]freq){
        if(nums.length==ds.size()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i]==nums[i - 1] && !freq[i - 1]) {
                continue;
            }
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                Perm(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer>ds=new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Arrays.sort(nums);
        Perm(nums,ds,ans,freq);
        return ans;
    }
}