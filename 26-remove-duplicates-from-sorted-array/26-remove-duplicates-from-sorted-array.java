class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int len = nums.length, cnt = 0;
        for(int i = 1; i < len; i++) 
            if(nums[i] != nums[cnt]) 
                nums[++cnt] = nums[i];
        return ++cnt;
    }
}