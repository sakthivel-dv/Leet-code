class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List <Integer>  myList = new ArrayList<>();
        int n = matrix.length * matrix[0].length;
        int count = 0;

        while ( count < n ) {
             
            for( int i = left; i <= right &&  count < n ; i++ ){
                myList.add(matrix[top][i]);
                count ++;
            }
            top ++;
             
            for( int i = top ; i <= bottom &&  count < n ; i++ ){
                myList.add( matrix[i][right]);
                count++;
            }
            right --;
     
            for( int i = right   ; i >= left && count < n; i--  ){
                myList.add( matrix[bottom][i]);
                count++;
            }
            bottom--; 
            
            for( int i = bottom  ; i >= top &&  count < n ; i-- ){
                myList.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return myList;
    }
}