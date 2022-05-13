class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        
        // Traversing over the array..
        
        for(int[] person : accounts){
            int sum = 0;
            
            for(int account: person){
                sum += account;
            }
            
            // Check if the sum of all accounts is greater than previously checked person.. Update max if so..
            if(sum > max){
                max = sum;
            }
        }
        
        return max;
    }
}