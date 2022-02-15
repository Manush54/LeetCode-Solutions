class Solution {
    public int firstMissingPositive(int[] nums) {
        int N = nums.length;
        // Creating a new array of length N
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
            // If positive and < N, store nums[i] value in A in the position nums[i]-1
            if(nums[i]>0 && nums[i]<=N)
                A[nums[i]-1] = nums[i];
        
        // Find the missing +ve integer
        for(int i = 0; i < N; i++){
            if(A[i] != i+1)
                return i+1;   
        }
        // Return N+1 if all the elements are present
        return N+1;
    }
}