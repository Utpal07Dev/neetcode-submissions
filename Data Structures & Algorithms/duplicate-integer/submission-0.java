class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int x:nums){
            if(!a.contains(x) || a.isEmpty()){
                a.add(x);
            }
            else
            return true;
        }
        return false;
    }
}