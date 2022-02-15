public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int l = nums.length;
        for(int i: nums){
         sum += i;   
        }            
        return (l*(l+1))/2 - sum;
    }
}