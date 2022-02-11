class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        
        // Case not possible
        if(len1 > len2) return false;
        
        // Creating an array of 26 letters for all alphabets count
        int[] count = new int[26];
        
        // Adding the count of letters in s1 in the array
        for(int i = 0; i < len1; i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        

        // If first l1 characters in s1 = first l1 characters in s2
        if(allZeros(count)) return true;
        
        // Sliding Window... Strating from i = len1 upto len2-1
        // Subtract the count of letter in count for each letter in s2
        // Add the count once the letter passes the window
        // Check if the count array becomes zero at any time? Return true if so.
        for(int i = len1; i < len2; i++){
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i-len1) - 'a']++;
            
            if(allZeros(count)) return true;
        }
        
        return false;
    }
    
    // Check if the array containes all zero values
    public boolean allZeros(int[] check){
        for(int i = 0; i < 26; i++){
            if(check[i] != 0) return false;
        }
        return true;
    }
}