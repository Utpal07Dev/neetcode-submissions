class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        int water = 0;
        while(current<height.length){
            while(!stack.isEmpty() && height[current]>height[stack.peek()]){
                int bottomIndex = stack.pop();
                 if (stack.isEmpty()) {
                    break;
                }
                int leftIndex = stack.peek();
                int width = current - leftIndex -1;
                int boundedHeight = Math.min(height[current], height[leftIndex]) - height[bottomIndex];
                water+= width*boundedHeight;
                
            }
            stack.add(current);
            current++;
        }
        return water;
    }
}
