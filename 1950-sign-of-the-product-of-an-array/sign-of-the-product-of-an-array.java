class Solution {
    public int arraySign(int[] nums) {
     int negnumbers=0;
     for(int n:nums)
     {
        if(n<0)negnumbers++;
        if(n==0)return 0;
     }  
     return negnumbers %2==0 ?1:-1;
    }
}