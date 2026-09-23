class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> stk1 = new Stack();
        int pops = 0;
        
        for(int i = 0; i < pushed.length; i++){
            stk1.push(pushed[i]);
            while(  !stk1.isEmpty() && pops < pushed.length && 
                    popped[pops] == stk1.peek()){
                stk1.pop();
                pops++;
            }
        }

            while(  !stk1.isEmpty() && pops < pushed.length && 
                    popped[pops] == stk1.peek()){
                stk1.pop();
                pops++;
            }
            
            return stk1.isEmpty() ? true : false; 
    }
}