/*

When you meet even number the count of '1's is always the same as its half number, 
On the other hand, remember to plus one to the odds' half number. 

i >> 1 => Halves the number(i/2) i.e. 4/2 = 2, 5/2=2
i & 1  => Returns i%2
Hence, 
If the number is even.. i/2 = number of '1's + i&1 = 0
If the number is odd... i/2 = number of '1's - 1(5/2 -> 2) + i&1 = 1
*/
class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        
        for ( int i = 0; i <= n; i++) count[i] = count[i >> 1] + (i & 1);  
        return count;
    }
}