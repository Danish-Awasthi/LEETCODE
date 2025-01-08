class Solution {
public void comb(String digits,int idx,StringBuilder sb,Map<Character,String> mp, List<String>ans){
        if(idx==digits.length()){
          ans.add(sb.toString());
          return;
        }
        String letters= mp.get(digits.charAt(idx));
        for(char c:letters.toCharArray()){
            sb.append(c);
            comb(digits,idx+1,sb,mp,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0||digits==null) return ans;
        Map<Character,String> mp =new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        comb(digits,0,new StringBuilder(),mp,ans);
        return ans;
    }
}