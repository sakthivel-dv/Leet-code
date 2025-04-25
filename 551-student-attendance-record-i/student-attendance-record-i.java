class Solution {
    public boolean checkRecord(String s) {
       int h1=0;
       for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='A'){
        h1++;
       }
       if(h1>=2){
        return false;
       }
       } 
       if(s.contains("LLL")){
        return false;
       }
       return true;
    }
}