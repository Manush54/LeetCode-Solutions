class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        for(int i = 0; i <= n; i++){
            char[] str = (Integer.toBinaryString(i)).toCharArray();
            for(char ch : str){
                // System.out.println(ch);
                if(ch == '1') count[i]++;
            }
        }        
        return count;
    }
}