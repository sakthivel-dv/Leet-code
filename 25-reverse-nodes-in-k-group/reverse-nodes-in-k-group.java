
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null && k==1){
            return head;
        }
        ListNode curr = head;
        ListNode newHead = null;
        ListNode tail = null;
        
        while(curr!=null){
            
            ListNode temp = curr;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            if (count < k) {
                // Not enough nodes to reverse, link the rest as is it
                if (tail != null) {
                    tail.next = curr;
                }
                break;
            }

            ListNode grpHead = curr;
            ListNode nextNode = null;
            ListNode prev = null;
            count =0;
            
            while(curr!=null && count<k){
                nextNode = curr.next;
                curr.next = prev;

                prev = curr;
                curr = nextNode;
                count++;
            }
            if(newHead == null) newHead = prev;

        
            if(tail != null) tail.next = prev;

            
            tail = grpHead;
        }
        return newHead;
    }
}
