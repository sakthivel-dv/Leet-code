class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    
    private void backtrack(List<String> res, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            res.add(current);
            return;
        }
        
        if (open < n) 
            backtrack(res, current + "(", open + 1, close, n);
        
        if (close < open) 
            backtrack(res, current + ")", open, close + 1, n);
          
    }
}