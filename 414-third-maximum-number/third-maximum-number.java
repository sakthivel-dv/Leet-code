class Solution {
    public int thirdMax(int[] nums) {
     HashSet<Integer>h1=new HashSet<>();
     for(int i:nums){
        h1.add(i);
     }
     int h2[]=new int[h1.size()];
     int j=0;
     for(int i:h1){
       h2[j]= i;
       j++;
     }
     Arrays.sort(h2);
     if(h2.length<3)
     return(h2[h2.length-1]);
     return(h2[h2.length-3]);
       
     }   
    }