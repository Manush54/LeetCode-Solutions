class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        int start = 0, end = 0;
        List<String> res = new ArrayList<>();
        for(int i = 0; i < len; i++){
            // Check for end of array condition && then for next position
            // Traverse till valid range positions
            while(i < len-1 && (nums[i] + 1) == nums[i+1]){
                end++;
                i++;
            }
            // If single integer range eg.[7,7]
            if(start == end) {
                res.add(String.valueOf(nums[start]));
            } else {
                res.add(nums[start] + "->" + nums[end]);
            }
            // Update end position to next
            start = ++end;  // start and end both pointing to the next element
        }
        return res;
    }
}