class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length <= 2) {
            return nums.length;
        }
    // int write = 0;
    //    int i = 0;
    //    int n = nums.length;
    //    while(i<n){
    //     int k = 1;
    //     int num = nums[i];
    //     int j = i+1;
    //     while(j<n && num==nums[j]){
    //         j++;
    //         k+=1;
    //     }
    //     i=j;
    //     if(k>=2){
    //         nums[write++]=num;
    //         nums[write++]=num;
    //     }else{
    //         nums[write++]=num;
    //     }

    //    }
    //    return write;




    // optimized
    int write = 2 ;
    for(int read = 2 ;read<nums.length;read++){
        if(nums[read]!=nums[write-2]){
            nums[write]= nums[read];
            write++;
        }
    }

    return write;  
    }
}