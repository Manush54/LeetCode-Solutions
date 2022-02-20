class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Initialising start, end, result
        int res = 0,  start = -1, end = -1;
        
        // Sorting according to "start" of the intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        for (int[] v : intervals) {
            // [[1,4] , [2,5]]
            // 2 > 1 && 5 > 4 -> true -- hence unique intervals 
            if (v[0] > start && v[1] > end) {
                start = v[0];
                res++;
            }
            // "end" will be kept maximum
            end = Math.max(end, v[1]);
        }
        return res;
    }
}