public class Solution {
    public String reverseStr(String s, int k) {
        
        char[] arr = s.toCharArray();
        int len = arr.length;
        //Checking for initial conditions
        if(len == 1 || k == 1) return s;
        
        // Traversing the string 
        int low = 0;
        while(low < len) {
            int j = Math.min(low + k - 1, len - 1);
            swap(arr, low, j);
            low += 2 * k;
        }
        return String.valueOf(arr);
    }
    
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}