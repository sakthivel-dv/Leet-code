class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length;
        int size=len*len;
        int count[]=new int[size+1];
        int repeat=-1;
        int missing=-1;
        for(int[] row:grid)
        {
            for(int num:row)
            {
                count[num]++;
            }
        }
        for(int j=1;j<=size;j++)
        {
            if(count[j]==2) repeat=j;
            if(count[j]==0) missing=j;

        }

return new int[]{repeat,missing};

    }
}