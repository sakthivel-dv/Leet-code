class Solution {
    public int minOperations(int[] nums) {
        int gcdVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcdVal = gcd(gcdVal, nums[i]);
        }
        if (gcdVal != 1) return -1;

        for (int x : nums) {
            if (x == 1) {
                int ans = 0;
                for (int y : nums) {
                    if (y != 1) ans++;
                }
                return ans;
            }
        }

        int ans = (int) 1e9;
        for (int i = 0; i < nums.length; i++) {
            int g = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    ans = Math.min(ans, j - i + nums.length - 1);
                    break;
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
