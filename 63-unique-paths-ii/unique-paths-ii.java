class Solution {
     public int solve(int [][]obstacleGrid , int [][]dp ,int m, int n, int x , int y){
      
        if(m > x || n > y) return 0;
        if(obstacleGrid[m][n] == 1) return 0;
        if(dp[m][n]!= -1 ) return dp[m][n];
        int right = solve(obstacleGrid, dp , m+1 , n ,x , y);
        int left =  solve(obstacleGrid , dp , m , n+1 , x ,y);
        dp[m][n] = right + left;
        return dp[m][n];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]= new int[m][n];
      
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }  dp[m-1][n-1] = 1;
        return solve(obstacleGrid,dp , 0 , 0 , m-1,n-1) ;
    }
}