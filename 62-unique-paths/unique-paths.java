class Solution {
    public int solve(int [][]dp ,int m, int n, int x , int y){
        int sum =0; 
        if(m > x || n > y) return 0;
        if(dp[m][n]!= -1 ) return dp[m][n];
        int right = solve(dp , m+1 , n ,x , y);
        int left =  solve(dp , m , n+1 , x ,y);
        dp[m][n] = right + left;
        return dp[m][n];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
      
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }  dp[m-1][n-1] = 1;
        return solve(dp , 0 , 0 , m-1,n-1) ;

    }
}