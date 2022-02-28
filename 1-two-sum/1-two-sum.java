/*
i/p-> 15,11,7,2
check_map = {
15,1
11,2
 7,3
}
 at 2 -> 9 - 2 = 7 returns true
 hence solution returned = [3,4]
*/
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