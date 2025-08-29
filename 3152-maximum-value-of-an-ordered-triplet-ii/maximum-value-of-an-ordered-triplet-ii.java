class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;
        
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        
        
        maxLeft[0] = Integer.MIN_VALUE; 
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i - 1]);
        }
        
       
        maxRight[n - 1] = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i + 1]);
        }
        
        long maxValue = 0;
        
        
        for (int j = 1; j < n - 1; j++) {
            if (maxLeft[j] == Integer.MIN_VALUE || maxRight[j] == Integer.MIN_VALUE) {
                continue; 
            }
            long val = (long)(maxLeft[j] - nums[j]) * maxRight[j];
            if (val > maxValue) {
                maxValue = val;
            }
        }
        
        return maxValue > 0 ? maxValue : 0;
    }
}
