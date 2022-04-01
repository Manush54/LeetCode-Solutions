class Solution {
    public static boolean[] vowels = new boolean[256];
    static{
        vowels['a'] = true;
        vowels['A'] = true;
        vowels['e'] = true;
        vowels['E'] = true;
        vowels['i'] = true;
        vowels['I'] = true;
        vowels['o'] = true;
        vowels['O'] = true;
        vowels['u'] = true;
        vowels['U'] = true;
    }
    
    public String reverseVowels(String s) {
        
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            
            // Move left pointer till vowel is found
            while(left < right && !vowels[str[left]]) left++;
            
            // Move right pointer till vowel is found
            while(left < right && !vowels[str[right]]) right--;
            
            // swap
            if(left < right){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(str);
    }
}