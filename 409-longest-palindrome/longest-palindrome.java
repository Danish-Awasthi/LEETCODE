class Solution {
    public int longestPalindrome(String st) {
       Set<Character> s =new HashSet<>();
       int length=0;
       for(char c:st.toCharArray()){
         if(s.contains(c)){
            s.remove(c);
            length=length+2;
         }
         else{
            s.add(c);
         }
       }
       if(!s.isEmpty()) {
            length+=1;
        }
        return length;
    }
}