class Solution {
    public int firstUniqChar(String s) {
        // int[] count = new int[26];
        // int index = -1;
        // for(int i = 0;i<s.length();i++){ 
        //             count[s.charAt(i)-'a']++;
        // }
        // for (int i = 0; i < s.length(); i++) {
        //     if (count[s.charAt(i) - 'a'] == 1) {
        //         return i;
        //     }
        // }
        // return -1;



         int minIndex = Integer.MAX_VALUE;
        
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            
            if (index != -1 && index == s.lastIndexOf(ch)) {
                minIndex = Math.min(minIndex, index);
            }
        }
        
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex; 
    }
}