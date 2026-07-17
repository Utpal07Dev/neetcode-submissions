class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums == null || nums.length == 0) {
            return 0;
        }
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for(int x:set){
            int current = x;
            int streak =  1;

            if(!set.contains(current-1)){
                while(set.contains(current+1)){
                    streak++;
                    current+=1;                   
                }
                if(streak>longestStreak){
                    longestStreak=streak;
                }
            }
        }      
        return longestStreak;
    }
}
