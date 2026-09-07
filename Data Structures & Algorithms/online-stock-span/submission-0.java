class StockSpanner {
    Stack<int[]> stack ;
    public StockSpanner() {
        stack =  new Stack<>();
    }
    
    public int next(int price) {
        // int currentSpan = 1;
        // while(!stack.isEmpty() && stack.peek()[0]<=price){
        //     currentSpan += stack.pop()[1];
        // }
        // stack.push(new int[]{price, currentSpan});
        
        // return currentSpan;

        int currentspan = 1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            currentspan+=stack.pop()[1];
        }
        stack.push(new int[]{price,currentspan});
        return currentspan;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */