public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // Sort the array and place the repeated elements in the missing place
        // [2,2,3,1,1] => [1,2,3, 1,2]
        
        for (int i = 0; i < nums.length; i++) {
            // Placing the elements in their correct positions
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            // adding index numbers where nums[i] is missing
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
}