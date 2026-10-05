class Solution {
    public int[] replaceElements(int[] arr) {
    //     int max = -1;
    //     for(int i = arr.length-1;i>=0;i--){
    //         int temp = max;
    //         max = Math.max(max,arr[i]);
    //         if(i==arr.length-1)arr[i] = -1;
    //         else{
    //             arr[i] = temp;
    //         }
    //     }
    // return arr;
    int maxRight  = -1;
    for(int i = arr.length-1;i>=0;i--){
        int current = arr[i];
        arr[i] = maxRight;
        maxRight=Math.max(maxRight,current);
    }
    return arr;
    }
}