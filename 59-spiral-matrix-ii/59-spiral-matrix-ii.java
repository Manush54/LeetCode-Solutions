class Solution {
    public int[][] generateMatrix(int n) {
       int[][] res = new int[n][n];
        int cnt=1;
        int top = 0, bottom =n-1,left =0,right =n-1;
        while(top <= bottom && left <= right)
        {
            for(int i=left;i<= right;i++)
            {
                res[top][i]=cnt++;
            }
            top++;
            for(int i= top;i<= bottom;i++)
            {
                res[i][right]=cnt++;
            }
            right--;
            for(int i= right;i>= left;i--)
            {
                res[bottom][i]=cnt++;
            }
            bottom--;
            for(int i= bottom;i>= top;i--)
            {
                res[i][left]=cnt++;
            }
            left++;
        }
        return res;
    }
}