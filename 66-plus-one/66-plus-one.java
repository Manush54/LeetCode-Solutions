class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        // Reverse for loop
        for(int i = len-1; i >= 0; i--){
            // Normal(Best) Case -> Last digit < 9
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            // Make ith digit 0 and move to previous digit.. repeat
            digits[i] = 0;
        }
        
        // If all numbers are 999..
        int[] newNumber = new int[len+1];
        newNumber[0] = 1; // 10000...
        
        return newNumber;
    }
}