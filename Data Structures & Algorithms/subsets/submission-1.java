class Solution {
    // public static void backtrack(List<List<Integer>> result,int idx,int nums[],List<Integer> current){
    //     if(idx>=nums.length){
    //         result.add(new ArrayList(current));
    //         return;
    //     }
    //     current.add(nums[idx]);
    //     backtrack(result,idx+1,nums,current);
    //     current.remove(current.size()-1);
    //     backtrack(result,idx+1,nums,current);

    // }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // backtrack(result,0,nums,new ArrayList<>());
        // return result;

        result.add(new ArrayList<>());
        for(int x:nums){
            int size = result.size();
            for(int i  =0;i<size;i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(x);
                result.add(subset);
            }
        }
        return result;

    }
}
