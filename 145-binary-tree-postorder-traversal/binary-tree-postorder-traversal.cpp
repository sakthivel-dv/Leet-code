
class Solution {
public:
 void traverse(vector<int>&v,TreeNode *root){
        if(root==NULL){
            return;
        }
        traverse(v,root->left);
        traverse(v,root->right);
        v.push_back(root->val);
    }
    vector<int> postorderTraversal(TreeNode* root) {
         vector<int>v;
         traverse(v,root);
         return v;
    
        
    }
};