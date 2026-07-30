class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
 
        int i = 0;
        int writeidx=0;
        while(i<n){
            int count = 1;
            while(i<n-1 && chars[i]==chars[i+1] ){
                i++;
                count++;
            }
             chars[writeidx++]=chars[i];
            
            if(count>1){
               
            
                for(char c:String.valueOf(count).toCharArray()){
                    chars[writeidx++]=c;
                }
            }
            i++;
        }
        return writeidx;
    }
}