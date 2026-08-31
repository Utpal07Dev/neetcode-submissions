class Solution {
    // public static boolean isPalindrome(String s,int left,int right){
    //     while (left < right) {
    //         if (s.charAt(left) != s.charAt(right)) {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;

    // }
    public static void backtrack(int start,String s,boolean[][] dp,List<String> currentList,List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(currentList));
            return ;
        }
        for(int end = start;end<s.length();end++){
            if(dp[start][end]){
                currentList.add(s.substring(start, end + 1));
                backtrack(end+1,s,dp,currentList,result);
                currentList.remove(currentList.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i =n-1;i>=0;i--){
            for(int j = i;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])){
                    dp[i][j]=true;
                }
            }
        }
        List<List<String>> result = new ArrayList<>();
        backtrack(0,s,dp,new ArrayList<String>(),result);
        return result;
    }
}
