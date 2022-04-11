class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int total_num = m * n;
        int start = total_num - k % total_num;    // if k = 5, then start = 5th last element
        LinkedList<List<Integer>> answer = new LinkedList<>();
        
        
        // From start to total_num + start.. looping through all the elements
        for (int i = start; i < total_num + start; i++){
            int j = i % total_num; // Calculating the position of the element if 1D array
            
            int r = j / n; // which row?
            int c = j % n; // which position in the jth row?
            
            // If remainder 0, then new row is to be initiated
            if((i-start) % n == 0)
                answer.add(new ArrayList<Integer>());
            
            // Adding the element as the latest position in "ans"
            answer.peekLast().add(grid[r][c]);
        }
        
        return answer;
    }
}