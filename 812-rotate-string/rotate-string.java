class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String finals =s+s;
        if(finals.contains(goal)) return true;
        else return false;
    }
}