class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int maxDepth = 0;
        int depth = 0;
        for(int i = 0;i<n;i++){
            char c =s.charAt(i);
            if(c=='('){
                depth++;
            }
            else if (c ==')'){
                depth--;
            }
            else continue;
            maxDepth  = Math.max(depth,maxDepth);

        }
        return maxDepth;
    }
}