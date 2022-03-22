class Solution {
   public String getSmallestString(int n, int k) {
        
        char[] charArr = new char[n];
        Arrays.fill(charArr, 'a');
        
        k -= n;                               // since all array is 'a'
        int count_25 = k / 25, i;                        // We only need 25 extra to make 'a' to 'z' 
        for (i = 1; i <= count_25; i++)
            charArr[n-i] = 'z';    // last elements that can be made 'z' made 'z'
        if (n > count_25) {
            charArr[n-i] = (char)('a' + (k % 25));
        }    // if ast element that is before Zs have value other than 'a'  
        
        return String.valueOf(charArr);
    }
}