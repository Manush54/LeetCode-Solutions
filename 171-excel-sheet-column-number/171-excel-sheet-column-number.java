class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(char c: columnTitle.toUpperCase().toCharArray()){
            // Similar to Decimal but with base 26
            res *= 26;
            
            // Difference of two characters returns an integer
            // 'C' - 'A' = 2
            res += c - 'A' + 1;
        }
        
        return res;
    }
}