class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mps=new HashMap();
        Map<Character,Integer> mpt=new HashMap();
        for(int i=0;i<s.length();i++){
            if(!mps.containsKey(s.charAt(i))){
               mps.put(s.charAt(i),i);
            }
            if(!mpt.containsKey(t.charAt(i))){
               mpt.put(t.charAt(i),i);
            }
        }
        for(int i=0;i<s.length();i++){
            if(!mps.get(s.charAt(i)).equals(mpt.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}