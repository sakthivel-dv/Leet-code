
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
   dfs(original,cloned,target);
   return ans;     
    }
    public TreeNode ans= null;
    public void dfs(TreeNode original,TreeNode cloned, TreeNode target){
        if(ans!=null)
        return;
        if(original==null)
        return;
        if(original==target){
            ans=cloned;
        }
        dfs(original.left,cloned.left, target);
        dfs(original.right,cloned.right, target);
    }
}