class Solution {
    static void sum(int i,List<Integer> current,List<List<Integer> > result,int[]nums,int target){
        if(target==0){
            result.add(new ArrayList<>(current));
            return ;
        }
          if(i == nums.length)return;
          if(nums[i]<=target){
            current.add(nums[i]);
            sum(i,current,result,nums,target-nums[i]);
            current.remove(current.size()-1);
        }
        sum(i+1,current,result,nums,target);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        sum(0,new ArrayList<>(),result,nums,target);
        return result;
    }
}
