class Solution {
    public int maxProfit(int[] prices) {
    int sold=Integer.MIN_VALUE;
    int held=Integer.MIN_VALUE;
    int reset=0;
    for(int p:prices){
     int prevSold=sold;
     sold=held+p;
     held=Math.max(held,reset-p);
     reset=Math.max(reset,prevSold);   
    }    
    return Math.max(sold,reset);
    }
}