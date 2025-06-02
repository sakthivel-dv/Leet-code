class Solution {
    public int numIdenticalPairs(int[] nums) {
     int val[]= new int[101];

        int sum=0;

        for(int i=0; i<nums.length; i++){
            sum+= val[nums[i]]++;
        }

        return sum ;   
    }
}