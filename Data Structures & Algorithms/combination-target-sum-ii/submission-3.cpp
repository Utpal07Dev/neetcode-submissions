class Solution {
public:
    void backtrack(const vector<int>& candidates,vector<vector<int>>& result,vector<int>& current,int target,
    int start){
        if(target ==0){
            result.push_back(current);
            return;
        }
        if(target<0) return;
        for(int i = start;i<candidates.size();i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            
            current.push_back(candidates[i]);
            backtrack(candidates, result, current, target - candidates[i], i + 1);
            current.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        vector<vector<int>> result;
        vector<int> current;
        backtrack(candidates,result,current,target,0);
        return result;
    }
};