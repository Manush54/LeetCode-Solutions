class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int single = 0;
        // HashSet<Integer> set = new HashSet();
        for (int i =0; i < nums.length; i++){
            if(i==0 && nums[i] != nums[i+1]){
                single = nums[i];
                break;
            }
            if(i==nums.length-1 && nums[i] != nums[i-1]){
                single = nums[i];
                break;
            }
            if(i!=0 && i!=nums.length-1 && nums[i] != nums[i-1] && nums[i] != nums[i+1] ){
                single = nums[i];
                break;
            }
        }
        
        return single;
    }
}