class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        for(int x:nums){
            if(x%2==0)result[i++]=x;
            else result[j--]=x;
        }
        return result;
    }
}