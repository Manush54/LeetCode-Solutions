class Solution {
    public boolean halvesAreAlike(String s) {
        char[] ab = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()/2){
                if(ab[i] == 'a' || ab[i] == 'e' || ab[i] == 'i' || ab[i] == 'o' || ab[i] == 'u'
                  || ab[i] == 'A' || ab[i] == 'E' || ab[i] == 'I' || ab[i] == 'O' || ab[i] == 'U')
                    cnt++;
            }
            else{
                if(ab[i] == 'a' || ab[i] == 'e' || ab[i] == 'i' || ab[i] == 'o' || ab[i] == 'u'
                  || ab[i] == 'A' || ab[i] == 'E' || ab[i] == 'I' || ab[i] == 'O' || ab[i] == 'U')
                    cnt--;
            }
        }
        
        return cnt == 0;
    }
}