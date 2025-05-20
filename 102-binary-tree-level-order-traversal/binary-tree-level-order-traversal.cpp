
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
     vector<vector<int>> result;
     if(root==NULL) return result;
     queue<TreeNode*>q;
     q.push(root);
     while(!q.empty()){
        int n=q.size();
        vector<int>res;
        while(n){
            TreeNode*curr=q.front();
            q.pop();
            res.push_back(curr->val);
            if(curr->left!=NULL) q.push(curr->left);
            if(curr->right!=NULL) q.push(curr->right);
            n--;
        }
        result.push_back(res);
     }
     return result;
        
    }
};