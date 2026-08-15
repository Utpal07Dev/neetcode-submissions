class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // if(nums.length == 0||nums==null)return new int[0] ;
        // Deque<Integer> dq = new ArrayDeque<>();
        // int n = nums.length;
        // int[] result = new int[n-k+1];
        // int resultidx= 0;
        // for(int i = 0;i<n;i++){
        //     if(!dq.isEmpty() && dq.peekFirst()<=i-k){
        //         dq.pollFirst();
        //     }
        //     while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
        //         dq.pollLast();
        //     }
        //     dq.offerLast(i);
        //     if(i>=k-1){
        //         result[resultidx++]=nums[dq.peekFirst()];
        //     }
        // }
        // return result;




         if (nums == null || nums.length == 0) return new int[0];
    int n = nums.length;
    int[] result = new int[n - k + 1];
    int resultIndex = 0;
    
    
    int[] dq = new int[n]; 
    int head = 0; 
    int tail = 0; 

    for (int i = 0; i < n; i++) {
        
        if (head < tail && dq[head] <= i - k) {
            head++;
        }

      
        while (head < tail && nums[dq[tail - 1]] < nums[i]) {
            tail--;
        }

        dq[tail++] = i;

        
        if (i >= k - 1) {
            result[resultIndex++] = nums[dq[head]];
        }
    }
    return result;

    }
}
