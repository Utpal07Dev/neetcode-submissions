class Solution {
    public int calPoints(String[] operations) {
//         Stack<Integer> stack = new Stack<>();
//         for(int i = 0;i<operations.length;i++){
//             String c = operations[i];
//             // if(Character.isDigit(c)){
//             //     stack.push(Integer.parseInt(c));
//             //     continue;
//             // }
//             if("+".equals(c)){
//                 int a = stack.pop();
//                 int b = stack.pop();
//                 stack.push(b);
//                 stack.push(a);
                
//                 stack.push(a+b);
//             }else if("C".equals(c)){
//                 stack.pop();
//             }else if("D".equals(c)){
//                 stack.push(2*stack.peek());
//             }else{
//                 stack.push(Integer.parseInt(c));
//             }
//         }
//         int totalSum = 0;
// for (int score : stack) {
//     totalSum += score;
// }
// return totalSum;

        int n = operations.length;
        int[] stack = new int[n];
        int top = 0;
        for(int i = 0;i<n;i++){
        String c = operations[i];
            
            if("+".equals(c)){
                stack[top]=stack[top-1]+stack[top-2];
                top++;
            }else if("C".equals(c)){
                top--;
            }else if("D".equals(c)){
                stack[top]= 2*stack[top-1];
                top++;
            }else{
               stack[top++]=Integer.parseInt(c);
            }
        }
        int totalSum = 0;
       for (int i = 0;i<top;i++){
        totalSum +=stack[i];
       }
        return totalSum;

    }
}