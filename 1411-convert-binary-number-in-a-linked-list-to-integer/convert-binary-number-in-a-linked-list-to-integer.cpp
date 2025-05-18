
class Solution {
public:
    int getDecimalValue(ListNode* head) {
       int res=0;
        ListNode* t= head;
        int l=0;
        while(t){
            l++;
            t=t->next;
        }
        int i=l-1;
        ListNode* m= head;
        while(m){
            if(m->val==1){
                res+=pow(2,i--);
                m=m->next;
            }else{
                i--;
                m=m->next;
            }
        }


        return res;  
    }
};