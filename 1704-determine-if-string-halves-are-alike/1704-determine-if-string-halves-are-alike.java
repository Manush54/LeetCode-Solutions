class Solution {
    public boolean halvesAreAlike(String s) {
        // char[] ab = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i < s.length()/2){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                  || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    cnt++;
            }
            else{
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                  || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    cnt--;
            }
        }
        
        return cnt == 0;
    }
}