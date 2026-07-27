class Solution {
    public int removeDuplicates(int[] nums) {
        int UniqueCount = 1;
        int writeIndex = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]==nums[i])continue;
        nums[UniqueCount++] = nums[i];
        }
        return UniqueCount;
    }
}