public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        char[] arr = (Integer.toBinaryString(n)).toCharArray();
        for(char bit : arr) 
            if(bit == '1') count++;
        return count;
    }
}