class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Two Pointer Approach
        int pointer_1 = 0;               // start
        int pointer_2 = nums.length-1;   // end
        
        while(pointer_1 <= pointer_2){
            int sum = nums[pointer_1] + nums[pointer_2];
            
            // If sum greater -> decrement the end (pointer_2)
            // else if sum smaller -> increment the start(pointer_1)
            if(sum > target){
                 pointer_2--;
             } else if (sum < target){
                 pointer_1++;
             } else {
                 return new int[] {pointer_1 + 1, pointer_2 + 1};
             }
         }
        return new int[] {pointer_1 + 1, pointer_2 + 1};
    }
}