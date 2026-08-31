class Solution {
    public static boolean isPalindrome(String s,int left,int right){
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void backtrack(int start,String s,List<String> currentList,List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(currentList));
            return ;
        }
        for(int end = start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                currentList.add(s.substring(start, end + 1));
                backtrack(end+1,s,currentList,result);
                currentList.remove(currentList.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0,s,new ArrayList<String>(),result);
        return result;
    }
}
