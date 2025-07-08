class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();
        int halfSize = q.size() /2;
        
        for(int i = 0;i<halfSize;i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }
        
        for(int i = 0;i<halfSize;i++){
            q.add(q.remove());
        }
        for(int i=0;i<halfSize;i++){
            st.push(q.remove());
        }
       while (!st.isEmpty()) {
            q.add(st.pop());  
            q.add(q.poll());   
        }
        
        return q;
        
    }
}
