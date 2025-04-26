class Solution {
    public boolean rotateString(String s, String goal) {
       String p="";
       if(s.length()==goal.length()){
        p=s+s;
        return p.contains(goal);
       } 
       return false;
    }
}