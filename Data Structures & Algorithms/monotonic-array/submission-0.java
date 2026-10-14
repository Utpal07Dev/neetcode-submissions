class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                continue;
            }
            else {
                isDecreasing = false;
                break;
            }
        }

        for(int i = 0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;

            }
            else{
                isIncreasing = false;
                break;
            }
        }
        return isDecreasing||isIncreasing;
    }
}