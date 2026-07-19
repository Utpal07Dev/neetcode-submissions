class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2  = word2.length();
        StringBuilder sb = new StringBuilder(n1+n2);

        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if(i>=n1){
            while(j<n2)sb.append(word2.charAt(j++));
        }
        if(j>=n2){
            while(i<n1)sb.append(word1.charAt(i++));
        }
        return sb.toString();
    }
}