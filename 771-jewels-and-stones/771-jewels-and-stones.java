class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jw = jewels.toCharArray();
        char[] st = stones.toCharArray();
        int count = 0;
        
        for(char s : st){
            for(char j : jw){
                if(s == j){
                    count++;
                }
            }
        }
        
        return count;
    }
}