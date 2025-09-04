class Solution {
    public int minimumOperations(int[] nums) {
        int i=0;
        int c=0;
       while(true){
        List<Integer> list=new ArrayList<>();
        boolean flag=true;
            for(int j=i;j<nums.length;j++){
                 if(!list.contains(nums[j])){
                    list.add(nums[j]);
                 }
                 else{
                    flag=false;
                    c++;
                    i=i+3;
                    break;
                 }
            }
            if(flag){
                break;
            }
       }
       return c;
    }
}