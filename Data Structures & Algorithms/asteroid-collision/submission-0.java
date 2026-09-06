class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       int[] stack = new int[asteroids.length];
        int top = -1; // Pointer to the top of our array-stack
        
        for (int ast : asteroids) {
            boolean isDestroyed = false;
            
            
            while (top >= 0 && ast < 0 && stack[top] > 0) {
                int rightAst = stack[top];
                int leftAst = Math.abs(ast); 
                
                if (rightAst < leftAst) {
                    // Right asteroid explodes, current left one keeps going
                    top--;
                    continue; 
                } else if (rightAst == leftAst) {
                    // Both explode
                    top--;
                    isDestroyed = true;
                    break;
                } else {
                    // Current left asteroid explodes
                    isDestroyed = true;
                    break;
                }
            }
            
           
            if (!isDestroyed) {
                stack[++top] = ast;
            }
        }
        
        int[] result = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            result[i] = stack[i];
        }
        
        return result;
    }
}