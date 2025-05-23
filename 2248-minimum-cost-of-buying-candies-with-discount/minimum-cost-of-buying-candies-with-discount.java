class Solution {
    public int minimumCost(int[] cost) {
     final int n = cost.length;

        Arrays.sort(cost);

        int total = 0, i = n - 1;

        while(i >= 0) {
            for(int j = i; j >= i - 1 && j >= 0; --j)
                total += cost[j];

            i -= 3;
        }

        return total;   
    }
}