class Solution {
    public void genP(int open,int close,String curr, List<String> ans,int n){
        if(open==close && open+close==2*n){
            ans.add(curr);
            return;
        }
        if(open<n){
            genP(open+1,close,curr+"(",ans,n);
        }
        if(close<open){
             genP(open,close+1,curr+")",ans,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        genP(0,0,"",ans,n);
        return ans;
    }
}