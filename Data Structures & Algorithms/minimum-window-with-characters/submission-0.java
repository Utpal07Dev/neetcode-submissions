class Solution {
    public String minWindow(String s, String t) {
        int n1 = t.length();
        int n2 = s.length();
        if (s == null || n2 == 0 || t == null || n1 == 0) {
            return "";
        }
        if(n2<n1)return "";
        int[] targetCounts = new int[128];
        for (char c : t.toCharArray()) {
            targetCounts[c]++;
        }
        int[] window_count = new int[128];
        int left = 0;
        int right = 0;
        int required = n1;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while(right<n2){
            char rightChar = s.charAt(right);   
       
        if (targetCounts[rightChar] > 0) {
                required--;
        }
        targetCounts[rightChar]--;
        right++;
        while(required ==0){
            if(right - left <minLen){
                minLen = right - left;
                minStart = left;
            }

            char leftChar = s.charAt(left);
                targetCounts[leftChar]++;

            if (targetCounts[leftChar] > 0) {
                    required++;
            }
            left++;
        }
        }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

    }

}
