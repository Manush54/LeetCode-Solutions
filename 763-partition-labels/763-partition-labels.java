// Most Important Condition
// Each Letter appears in at most ine oart

// Most Important Goal
// Maximum possible number of partitions

class Solution {
    public List<Integer> partitionLabels(String S) {
        // Null Conditions
        if(S == null || S.length() == 0)
            return null;
        
        // Array of last occurence of all the letters
        int[] last_indices = new int[26];
        for(int i = 0; i < S.length(); i++)
            last_indices[S.charAt(i) - 'a'] = i;
        
        // Identifying maximum possible partition
        int start=0,end=0;
        List<Integer> res = new ArrayList();
        for(int i=0; i < S.length(); i++){
            end = Math.max(end, last_indices[S.charAt(i) - 'a']);
            // When i reaches to the end of the highest last occurence
            // It is certain that no character inside the partition will be present outside of it.
            if(i == end){
                res.add(end - start + 1);  // Add the partition size
                start = end + 1;  // Set 'start' to the start of new partition
            }
        }
        return res;
    }
}