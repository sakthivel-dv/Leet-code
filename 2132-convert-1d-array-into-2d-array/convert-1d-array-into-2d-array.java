class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
     if(m*n!=original.length){
        return new int[0][0];
     }   
     int[][]arr2D=new int[m][n];
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr2D[i][j]=original[i*n+j];
        }
     }
     return arr2D;
    }
}