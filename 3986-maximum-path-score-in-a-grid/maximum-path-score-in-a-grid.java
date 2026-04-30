 class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        
        int[] scoreAdd = {0, 1, 2};

        
        int[] costAdd = {0, 1, 1};

        
        int[][][] dp = new int[m][n][k + 1];
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    dp[i][j][c] = Integer.MIN_VALUE;
                }
            }
        }

        
        dp[0][0][0] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int used = 0; used <= k; used++) {
                    if (dp[i][j][used] == Integer.MIN_VALUE) continue;

                    int curScore = dp[i][j][used];

                   
                    if (i + 1 < m) {
                        int nc = used + costAdd[grid[i+1][j]];
                        if (nc <= k) {
                            int ns = curScore + scoreAdd[grid[i+1][j]];
                            dp[i+1][j][nc] = Math.max(dp[i+1][j][nc], ns);
                        }
                    }

                    
                    if (j + 1 < n) {
                        int nc = used + costAdd[grid[i][j+1]];
                        if (nc <= k) {
                            int ns = curScore + scoreAdd[grid[i][j+1]];
                            dp[i][j+1][nc] = Math.max(dp[i][j+1][nc], ns);
                        }
                    }
                }

            }
        }

        
        int best = Integer.MIN_VALUE;
        for (int c = 0; c <= k; c++) {
            best = Math.max(best, dp[m-1][n-1][c]);
        }

        return (best == Integer.MIN_VALUE) ? -1 : best;
    }
}

 