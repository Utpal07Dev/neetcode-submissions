class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        
        int[] counts = new int[26];
        int maxlength = 0;
        int maxFreq=0;
        for(int high = 0;high<s.length();high++){
            int currentIdx = s.charAt(high)-'A';
            counts[currentIdx]++;
            maxFreq = Math.max(maxFreq,counts[currentIdx]);
            while((high-low+1)-maxFreq>k){
                counts[s.charAt(low)-'A']--;
                low++;
            }
            maxlength = Math.max(high-low+1,maxlength);

        }
        return maxlength;
    }
}
