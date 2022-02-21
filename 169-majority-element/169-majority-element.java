class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count = 1;
        int major = nums[0];
        
        for (int i = 0; i < len; i++){
            if(nums[i] == major){
                count++;   
            }
            else{
                count--;
                if(count == 0){
                    major = nums[i];
                    count = 1;
                }
            }
        }
        return major;
    }
}