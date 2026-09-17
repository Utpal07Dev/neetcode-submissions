class Solution {
    public String decodeString(String s) {
       Deque<Integer> countStack = new ArrayDeque<>();
       Deque<StringBuilder> stringStack = new ArrayDeque<>();
       StringBuilder currentString  = new StringBuilder();
       int k = 0;
       for(char ch : s.toCharArray()){
        if(Character.isDigit(ch)){
            k=k*10+(ch-'0');
        }else if(ch=='['){
            countStack.push(k);
            k = 0;
            stringStack.push(currentString);
            currentString = new StringBuilder();
        }
        else if(ch==']'){
            StringBuilder decodedSegment = currentString;
            currentString = stringStack.pop();
            int repeatTimes = countStack.pop();
            for(int i = 0;i<repeatTimes;i++){
                currentString.append(decodedSegment);
            }
        }
        else{
                currentString.append(ch);
            }

       }
       return currentString.toString();
    }
}