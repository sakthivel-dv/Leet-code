import java.util.*;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    private long countPairs(int[] nums, int val) {
        long res = 0;
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i < j && nums[i] + nums[j] > val) {
                j--;
            }
            if (i < j) {
                res += (j - i);
            }
        }
        return res;
    }
}
