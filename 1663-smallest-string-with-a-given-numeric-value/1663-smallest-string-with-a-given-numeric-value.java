class Solution {
   public String getSmallestString(int n, int k) {
        
        char[] charArr = new char[n];
        Arrays.fill(charArr, 'a');
        
        k -= n; // Guarantee each character value is at least 1.
        
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            // Add the appropriate value(Math.min(25,k)) in charArr and subtract from total
            charArr[i] += Math.min(25, k);  // eg.(25,54) -> 25 smaller,, (14,25) -> 14 smaller
            k -= Math.min(k, 25);
        }
        
        return String.valueOf(charArr);
    }
}