public class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] result = {findFirst(nums,target), findLast(nums,target)};
    return result;
}

private int findFirst(int[] nums, int target){
    int index_s = -1, start = 0;
    int end = nums.length - 1;
    
    // Binary Search
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) index_s = mid;
    }
    return index_s;
}

private int findLast(int[] nums, int target){
    int index_e = -1, start = 0;
    int end = nums.length - 1;
    
    // Binary Search
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(nums[mid] == target) index_e = mid;
    }
    return index_e;
}
}