class Solution {
public:
    int rangeSum(vector<int>& nums, int n, int left, int right) {
        vector<int>ans;long long int answer=0;const int MOD = 1e9+7;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               sum+=nums[j];
               ans.push_back(sum);
            }
        }
        sort(ans.begin(),ans.end());
        for(int i=left-1;i<right;i++){
        answer=(answer+ans[i])%MOD;
        }
        return answer;
    }
};