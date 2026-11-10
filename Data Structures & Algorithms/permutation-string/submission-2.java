class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int n2 = s2.length();
        if(n2<n)return false;
        int[] count = new int[26];
        int[] windowCounts = new int[26];
        for(int i = 0;i<n;i++){
            count[s1.charAt(i)-'a']++;
            windowCounts[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(count, windowCounts)) {
            return true;
        }
        for(int i = n;i<n2;i++){
            windowCounts[s2.charAt(i) - 'a']++;
            windowCounts[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(count, windowCounts)) {
                return true;
            }
        }
        return false; 
    }
}
