class Solution {
    public static void backtrack(int[] candidates,List<List<Integer>> result,List<Integer> current,int target,int start){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0)return;
        for(int i = start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1])continue;
            current.add(candidates[i]);
            backtrack(candidates,result,current,target-candidates[i],i+1);
            current.remove(current.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,result,new ArrayList<>(),target,0);
        return result;
    }
}