class Solution {
    public static boolean searchPattern(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        char t[] = txt.toCharArray();
        char p[] = pat.toCharArray();
        
        for(int i=0;i<=n-m;i++){
            int j = 0;
            for(j = 0;j<m;j++){
                if(t[i+j] != p[j])
                    break;
            }
            if(j==m){
                return true;
            }
        }
        return false;
    }
    
}
