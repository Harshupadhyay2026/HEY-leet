
class Solution {

public static ListNode reverse(ListNode a){
    
         ListNode curr = a;
         ListNode fwd = null;
         ListNode prev = null;
         while (curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
         }
         return prev;  }

         public void  merge (ListNode head,ListNode a){

             ListNode dummy =   new ListNode (-1);
             dummy.next = head;
             ListNode temp = dummy;
             ListNode temp1 = head;
             ListNode temp2 = a;

               while (temp1!=null && temp2!=null){
                temp.next = temp1;
                temp1 = temp1.next;
                temp =temp.next ;

                temp.next = temp2;
                temp2 = temp2.next;
                temp =temp.next;
               }
               if (temp1!=null){
                temp.next = temp1;
               }
         }
    public void reorderList(ListNode head) {

        if (head ==null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!= null ){
            slow= slow.next;
            fast = fast.next.next;
        }
         ListNode  a = slow.next;
         slow.next = null;
          a =  reverse(a);
          merge(head,a);  
    }
}