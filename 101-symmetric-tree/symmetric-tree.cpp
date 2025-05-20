
class Solution {
public:
bool isSym(TreeNode*p,TreeNode*q){
    if(p==NULL && q==NULL) return true;
    if(p==NULL||q==NULL) return false;
    if(p->val!=q->val) return false;
    return isSym(p->left, q->right) && isSym(p->right,q->left);
}
    bool isSymmetric(TreeNode* root) {
       return isSym(root,root);
    }
    
};