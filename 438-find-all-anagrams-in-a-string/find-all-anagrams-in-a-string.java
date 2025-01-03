class Solution {
    public boolean match(int[] p,int[] s){
      for(int i=0;i<26;i++){
        if(p[i]!=s[i]){
        return false;
        }
      }
      return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()) return ans;
        int[] pcount=new int[26];
        int[] scount=new int[26];
        for(char ch:p.toCharArray()){
            pcount[ch-'a']++;
        }
        int plen=p.length();
        for(int i=0;i<s.length();i++){
            scount[s.charAt(i) - 'a']++;
            if(i>=plen){
                scount[s.charAt(i-plen)-'a']--;
            }
            if(match(scount,pcount)){
                ans.add(i-plen+1);
            }
        }
        return ans;
    }
}