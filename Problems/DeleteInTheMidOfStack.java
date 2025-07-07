class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
       
        // code here
        int size = s.size();
        int mid = (size)/2;
        
        solve(s,0,mid);
        
        
    }
    
    
    public void solve(Stack<Integer>s,int curr, int mid){
         if(s.isEmpty()){
            return;
        }
        
        int top = s.peek();
        s.pop();
        if(curr == mid){
            return;
        }
        solve(s,curr+1,mid);
        s.push(top);
    }
}
