class Solution {
     public static void backtrack(int index,List<Integer> current,List<List<Integer>> result,int n,int k){

        if(current.size()==k){
                result.add(new ArrayList<>(current));
                return;
        }
        for(int i=index;i<=n;i++){
                current.add(i);
                backtrack(i+1,current,result,n,k);
                current.remove(current.size()-1);

        }

    }
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> result = new ArrayList<>();
        backtrack(1, new ArrayList<>(), result,n,k);
        return result;
    }
}