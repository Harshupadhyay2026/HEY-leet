
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode dummy = new  ListNode(-1);
        ListNode curr= dummy;
        curr.next=head;
    
        while (curr!=null &&curr.next!=null){
          
        if (curr.next.val==val){
          curr.next = curr.next.next;
         
         }else{
            curr=curr.next;}
        }return dummy.next;
        
    }
}