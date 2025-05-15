/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
  struct ListNode*curr=head,*prev=NULL,*nextnode=NULL;
  while(curr!=NULL)
  {
    nextnode=curr->next;
    curr->next=prev;
    prev=curr;
    curr=nextnode;
  }  
  return prev;
}