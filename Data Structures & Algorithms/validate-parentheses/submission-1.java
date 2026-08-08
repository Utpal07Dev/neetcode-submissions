class Solution {
    char[] stack = new char[1000];
    int top = -1;
    public boolean isEmpty(){
        if(top==-1)return true;
        else return false;
    }
    public boolean isFull(){
        if(top==999)return true;
        else return false;
    }
    public void push(char c){
        if(isFull()) return;
        stack[++top]=c;
    }
    public char pop(){
        if(isEmpty())return ' ';
        return stack[top--];
    }
    public boolean isValid(String s) {
        Solution stk = new Solution();
        for(char c :s.toCharArray()){
            if(c=='[' || c=='{' || c =='('){
                stk.push(c);
            }else{
                if (stk.isEmpty()) return false;    
                char openBracket = stk.pop();
                if (c == ']' && openBracket != '[') return false;
            if (c == ')' && openBracket != '(') return false;
            if (c == '}' && openBracket != '{') return false;
                             }
        }
        return stk.isEmpty();
    }
}
