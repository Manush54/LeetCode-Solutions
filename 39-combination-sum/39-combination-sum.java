class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        backtrack(candidates, 0, target, new ArrayList(), result);
            return result;
    }
    
    private void backtrack(int[] cand, int start, int target, List<Integer> list, List<List<Integer>> result){
        // End Conditions || Stop Conditions
        if(target < 0)
            return;
        if(target==0)
            result.add(new ArrayList(list));
        
        // Loop for all the elements in  the candidates list
        for(int i = start; i < cand.length; i++){
            list.add(cand[i]);
            // Recursive backtracking for a single candidate
            // i.e 2 , 2-2 , 2-2-2 , 2-2-2-2 , ...
            backtrack(cand, i, target - cand[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}