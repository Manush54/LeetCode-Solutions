class Solution {
     public double champagneTower(int poured, int query_row, int query_glass) {
        double[] dp = new double[101];

        dp[0] = poured;

        for (int row = 0; row < query_row; row++) {
            for (int glass = row; glass >=0; glass--) {
                double excessAmount = dp[glass] - 1;
                if (excessAmount < 0) {
                    dp[glass] = 0;
                } else {
                    dp[glass] = excessAmount / 2;
                    dp[glass + 1] += excessAmount / 2;
                }
            }
        }

        return Math.min(1, dp[query_glass]);
    }
}