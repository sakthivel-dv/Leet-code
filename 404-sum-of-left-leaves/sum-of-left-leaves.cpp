
class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
     int count=0;

        queue<TreeNode *>q;
        
        q.push(root);
        
        while(!q.empty()){
            TreeNode *temp=q.front();
            q.pop();
            
            if (temp->left) {
                if (!temp->left->left && !temp->left->right) {
                    count += temp->left->val;
                }
                q.push(temp->left);
            }

          
            if(temp->right){
                q.push(temp->right);
            }
        }
        
        return count;
    }
};