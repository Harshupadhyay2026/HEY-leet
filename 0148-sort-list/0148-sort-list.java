
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next==null) return head;
     ListNode slow = head;
     ListNode fast = head;
     while (fast.next!=null && fast.next.next!= null){
        slow = slow.next;
        fast = fast.next.next;
     }
     ListNode head2 = slow.next;
      slow.next= null;
      
      head=  sortList(head);          //merge sorting by recursion
      head2 =  sortList(head2);
      return mergeTwoLists(head,head2) ;   //merging two sorted lists
        
    }
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode dummy = new ListNode(-1);
     ListNode i = list1;
     ListNode j = list2;
     ListNode k = dummy;
    

    while (j != null && i != null){
        if (i.val>j.val){
            k.next = j;
            j = j.next;
        }
        else  {
            k.next = i;
            i = i.next;
        }
        
        k = k.next;}
       
        k.next = (i!= null) ? i : j;
       return dummy.next;
}}
