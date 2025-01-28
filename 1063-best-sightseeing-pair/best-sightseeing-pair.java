class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxi=values[0],j=1,k=values.length;int sum=0;
        while(j<k){
            sum=Math.max(sum,maxi+values[j]-j);
            maxi=Math.max(maxi,values[j]+j);
            j++;
        }
        return sum;
    }
}