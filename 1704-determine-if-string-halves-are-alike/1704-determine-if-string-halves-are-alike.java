class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char[] ab = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()/2){
                if(ab[i] == 'a' || ab[i] == 'e' || ab[i] == 'i' || ab[i] == 'o' || ab[i] == 'u')
                    cnt++;
            }
            else{
                if(ab[i] == 'a' || ab[i] == 'e' || ab[i] == 'i' || ab[i] == 'o' || ab[i] == 'u')
                    cnt--;
            }
        }
        
        return cnt == 0;
    }
}