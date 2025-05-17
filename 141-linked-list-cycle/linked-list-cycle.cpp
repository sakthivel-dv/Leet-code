/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
       unordered_set<ListNode*>s;
       while(head!=nullptr)
       {
        if(s.count(head)==0)
        {
           s.insert(head); 
           head=head->next;
        }
        else
        {
            return true;
        }
        
       } 
       return false;
    }
};