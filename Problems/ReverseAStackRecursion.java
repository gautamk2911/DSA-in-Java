class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(s, top);
    }
    static void insertAtBottom(Stack<Integer> s, int value){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, value);
        s.push(top);
    }
}
