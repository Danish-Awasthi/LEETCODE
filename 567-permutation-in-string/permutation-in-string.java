class Solution {
    public boolean match(int[] sc1,int[] sc2){
        for(int i=0;i<26;i++){
            if(sc1[i]!=sc2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] s1count=new int[26];
        int[] s2count=new int[26];
        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }
        if (match(s1count,s2count)) return true;
        for(int i=s1.length();i<s2.length();i++){
            s2count[s2.charAt(i)-'a']++;
            s2count[s2.charAt(i-s1.length())-'a']--;
            if(match(s1count,s2count)) return true;
        }
        return false;
    }
}