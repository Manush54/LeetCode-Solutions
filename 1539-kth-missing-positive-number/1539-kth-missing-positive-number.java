class Solution {
    public int findKthPositive(int[] arr, int k) {
        // 2 5 6 7 8 10
        int i = 1;
        int curr = 0;
        while(k > 0 && curr < arr.length){
            if(i != arr[curr]){
                i++;
                k--;
            }
            else {
                curr++;
                i++;
            }
        }
        
        if(curr == arr.length){
            i += k;
        }
        
        return --i;
    }
}