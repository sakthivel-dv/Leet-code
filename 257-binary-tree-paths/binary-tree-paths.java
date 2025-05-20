
class Solution {
    public void helper(TreeNode root, ArrayList<String> result, StringBuilder sb){
        if(root==null){
            return;
        }
        int length=sb.length();
        if(root.left==null&&root.right==null){
            sb.append(root.val);
            result.add(sb.toString());
            sb.setLength(length);
            return;
        }
        sb.append(root.val);
        sb.append("->");
        helper(root.left,result,sb);
        helper(root.right,result,sb);
        sb.setLength(length);
    }
    public List<String> binaryTreePaths(TreeNode root) {
    ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        helper(root, result, sb);
        
        return result;
    }
}

