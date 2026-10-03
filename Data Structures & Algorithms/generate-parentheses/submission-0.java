class Solution {
    public static void generate(List<String> result,StringBuilder sb,int n,int left,int right){
        if (right > left || left > n) return;
        if(left ==n && right == n )
        {
            result.add( new String(sb.toString()));
        return;
        }
        sb.append("(");
        generate(result,sb,n,left+1,right);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        generate(result,sb,n,left,right+1);
        sb.deleteCharAt(sb.length() - 1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result,new StringBuilder(),n,0,0);
        return result;
    }
}
