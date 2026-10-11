/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;
         // t har loop me do baar jyega or dono ko ek ek baar connect krega
        while (t != null){     
            
            t1.next = t;
             t= t.next;      // ek baar odd position connect krega
            t1= t1.next;
           
            t2.next = t;
            if (t!= null)    // ek baar even position connect krega 
            t = t.next;     
             t2 = t2.next; 
        }
        t1.next = even.next;
        return odd.next;
        
    }
}