class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        List<List<Integer>> q = new ArrayList<>();
    Arrays.sort(nums);
    

         
        for(int i = 0;i<nums.length;i++){
         if((i != 0 && nums[i]== nums[i-1]) ){
            continue;

         }
         for(int m=i+1; m<nums.length; m++){
              if((m !=i+1 && nums[m]== nums[m-1]) ){
            continue;

         
         }

         int j= m+1;
         
         int k = nums.length-1;

         while(j<k){
             long total = (long)nums[i]+nums[m] + nums[j]+ nums[k] ;


             if(total < t) {
            j++;
             }else if(total > t){
                 k--;
               
             }else{
q.add(List.of(nums[i],nums[m], nums[j], nums[k]));
j++;
k--;

 while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                   
               


             }
         }
         }    
    }

    return q; 
    }
}