class Solution {
    public int maximumCount(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums[0]==0 && nums[high]==0) return 0;
        if(nums[0]>0 || nums[high]<0) return high+1;

        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid] < 0) low=mid+1; 
            else high=mid;
        }

        int countLeft=high;
        high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid] <= 0) low=mid+1;  
            else high=mid;
        }
        return Math.max(countLeft,nums.length-high);
    }
}
