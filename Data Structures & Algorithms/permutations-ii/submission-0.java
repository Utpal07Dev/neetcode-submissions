class Solution {
    public static void backtrack(int []nums,int idx,List<Integer> current,List<List<Integer>> result,boolean[] used){
        if (idx == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(used[i])continue;
             if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            used[i]=true;

            backtrack(nums,idx+1,current,result,used);

            used[i]=false;
            current.remove(current.size()-1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<Integer>(),result,new boolean[nums.length]);
        return result;
    }
}