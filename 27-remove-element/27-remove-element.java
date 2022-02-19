class Solution {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            // Replacing the first 'm' values with the required elements(nums[m] != value)
            if(nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}