class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
       
        int mindiff = 0;
        for(int i = 0;i<k;i++){
            result.add(arr[i]);
        }
       for(int i = k;i<arr.length;i++){
        int currentElement = arr[i];
        int oldest = result.get(0);
        if(Math.abs(oldest-x)>Math.abs(currentElement-x)){
            result.remove(0);
            result.add(currentElement);
           
        }else if (Math.abs(oldest - x) < Math.abs(currentElement - x)) {
                break;
            }
       }
       return result;
    }
}