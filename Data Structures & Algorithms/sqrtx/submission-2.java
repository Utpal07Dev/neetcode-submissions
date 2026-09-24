class Solution {
    public int mySqrt(int x) {
      long low = 0;
      long high = x;
      long mid=0;
      long res = 0;
      while(low<=high){
         mid = low + (high-low)/2;
         if(mid*mid==x){
                res = mid;
                break;
            }
        else if(mid*mid<x){
                res = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
      }  
    return (int)res;
    }
}