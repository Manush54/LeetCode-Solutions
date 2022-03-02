class Solution {
    public boolean isSubsequence(String s, String t) {
        
        char[]T = t.toCharArray();
        char[]S = s.toCharArray();
        int m = T.length, n = S.length;
        
        if(n==0 && m!=0 || n==0 && m==0) return true;
        
        int count=0;
        
        for(int i=0;i<m;i++){
            if(S[count] == T[i]) count++;
            if(count == n) return true;
        }
        
        return false;
    }
}