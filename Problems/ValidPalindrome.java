class Solution {
    public StringBuilder cleanString(String str){
        StringBuilder sb = new StringBuilder("");
        char ch[] = str.toCharArray();
        for(char c : ch){
           if(Character.isLetterOrDigit(c)){
            sb.append(Character.toLowerCase(c));
           }
        }
        return sb;
    }
    
    public boolean isPalindrome(String s) {
        StringBuilder sb = cleanString(s);        
        int st = 0, e = sb.length()-1;
        while(st < e){
            if(sb.charAt(st) != sb.charAt(e)){
                return false;
            }
            st++;
            e--;
        }

        return true;
    }
}
