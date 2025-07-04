class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        char[] ch = s.toCharArray();
        
        for(char c: ch){
            
            if(c == '[' || c == '{' || c == '('){
                myStack.push(c);
            } else{
                if(myStack.empty()){
                    return false;
                }
                char top = myStack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return myStack.empty();
    }
}
