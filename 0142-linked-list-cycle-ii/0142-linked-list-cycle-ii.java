/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast =  head;
        int pos=0;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast =fast.next.next;
            if (fast==slow) break;    // point when fast == slow is a breaking point 
        }
        if(fast==null || fast.next==null) return null;
        while(head!=slow){
            head= head.next;
            slow = slow.next;   //point where head meet the slow is the required position
        }
     return head;   
    }
}