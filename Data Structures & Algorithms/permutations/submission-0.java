class Solution {
    // public static void backtrack(int[] nums,List<Integer> current,List<List<Integer>> result,boolean[] used){
    //     if(current.size()==nums.length){
    //         result.add(new ArrayList<>(current));
    //         return;
    //     }
    //    for(int i = 0;i<nums.length;i++){
    //         if (used[i]) {
    //             continue;
    //         }
    //         used[i] = true;
    //         current.add(nums[i]);
    //         backtrack(nums,current,result,used);
    //         current.remove(current.size()-1);
    //         used[i] = false;
    //    }

private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Space optimized solution;
    public static void backtrack(int index,int [] nums,List<List<Integer>> result){
            if (index == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            result.add(current);
            return;
        }
        
        for(int i = index;i<nums.length;i++){
            swap(nums, index, i);
            
            
            backtrack(index + 1, nums, result);
            
          
            swap(nums, index, i);
        }
    }


    
    public List<List<Integer>> permute(int[] nums) {
        // List<List<Integer>> result = new ArrayList<>();
        // backtrack(nums, new ArrayList<>(), result,new boolean[nums.length]);
        // return result;
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, result);
        return result;
    }
}