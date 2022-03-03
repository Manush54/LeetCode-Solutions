class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0, res = 0;
        int len = nums.length;
        for(int i = 2; i < len; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                // dp[i] = 1 + dp[i-1];
                // new dp = 1 + old dp;
                dp = 1 + dp;
                res += dp;
            }
            else {  // If sequence breaks,, eg. (1,2,3,.., 8,12,16)
                dp = 0;
            }
        }
        
        return res;
    }
}