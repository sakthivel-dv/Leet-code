class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
    int res=0;
    int n=colors.length;
    int start=0,end=0;
    while(start<n && end<n+k){
       if(colors[(end)%n]==colors[(end+1)%n]){
        start=end;
       }
       if(end-start+1==k){
        res++;
        start++;
       }
       else{
        end++;
       }
    }    
    return res;
    }
}