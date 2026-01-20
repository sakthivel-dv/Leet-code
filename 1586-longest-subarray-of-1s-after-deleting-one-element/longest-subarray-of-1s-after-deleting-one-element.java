class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        int left = 0;

        int max = 0;

        boolean used = false;

        for(int right  =0 ;right<len;right++){

            while(nums[right] == 0 && used == true){
                
                if(nums[left] == 0)used = false;
                left++;
            }
            if(nums[right] == 0)used = true;
            max = Math.max(max,right-left);
        }
        return max;
    }
}