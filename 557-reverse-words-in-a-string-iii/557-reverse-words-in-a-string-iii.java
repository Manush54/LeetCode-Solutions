class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split(" ");
        String res = new String();
        for(int i = 0; i < splitted.length; i++){
            res = res + String.valueOf(swap(splitted[i].toCharArray())) + " ";
        }
        return res.trim();
    }
    
    private char[] swap(char[] s){
        int high = s.length-1, low = 0;
        while(low < high){
            char temp = s[low];
            s[low++] = s[high];
            s[high--] = temp;
        }
        
        return s;
    }
}