/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        boolean found = false;
        int mid=low + (high-low)/2;
        while(!found){
             mid = low + (high-low)/2;
            int s = guess(mid);
            if(s==0){
                return mid;
            }else if(s==-1){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}