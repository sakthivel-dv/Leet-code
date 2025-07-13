
class Solution {
    public ListNode swapPairs(ListNode head) {
     if(head==null||head.next==null){
      return head;  
     }   
     ListNode current=head;
     while(current!=null&&current.next!=null){
       int temp=current.val;
       current.val=current.next.val;
       current.next.val=temp;
       current=current.next.next; 
     }
     return head;
    }
}