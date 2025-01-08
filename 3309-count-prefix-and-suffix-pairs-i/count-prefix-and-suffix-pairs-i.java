class Solution {
    public boolean check(String p1,String p2){
        if(p1.length()>p2.length()) return false;
        if(p2.startsWith(p1) && p2.endsWith(p1)){
            return true;
        }
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        //Arrays.sort(words);
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(check(words[i],words[j])){
                     count++;
                }
            }
        }
        return count;
    }
}