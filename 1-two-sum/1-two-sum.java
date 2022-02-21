class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] solution = new int[2];
        
        // HashMap <nums[i], i>
        HashMap<Integer,Integer> check_map = new HashMap<Integer,Integer>();
        
        // Insert values in check_map until target-nums[i] i.e. secind element is not found!
        for(int i=0; i < len; i++){
            
            if(check_map.containsKey(target - nums[i])){
                solution[1] = i;
                solution[0] = check_map.get(target - nums[i]);
                return solution;
            }
            check_map.put(nums[i], i);
            
        }
        return solution;
        
    }
}