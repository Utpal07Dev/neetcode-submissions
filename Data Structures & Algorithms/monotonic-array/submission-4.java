class Solution {
    public boolean isMonotonic(int[] nums) {
        // boolean isIncreasing = true;
        // boolean isDecreasing = true;
        // int n = nums.length;
        // for(int i = 0;i<n-1;i++){
        //     if(nums[i]>=nums[i+1]){
        //         continue;
        //     }
        //     else {
        //         isDecreasing = false;
        //         break;
        //     }
        // }

        // for(int i = 0;i<n-1;i++){
        //     if(nums[i]<=nums[i+1]){
        //         continue;

        //     }
        //     else{
        //         isIncreasing = false;
        //         break;
        //     }
        // }
        // return isDecreasing||isIncreasing;




    
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
            
     
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true; 
    }
}