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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
         ListNode d2 = new ListNode(-1);
         ListNode t1 = d1;    // its for creating list less than x value
         ListNode t2 = d2 ;  // its for rest of the value greater than k
          
          ListNode t = head; // its for traversing the whole list at each step

          while (t!=null){
            if (t.val<x){
                t1.next =t;
                t1=t1.next;}     //traversing t1 after connecting it to req temp value
                else{
                t2.next = t;
                t2 =t2.next;}    // traversing t2 after combining it to req temp value
                t = t.next;}
                t1.next = d2.next;  //combining both the list
                t2.next = null;     // setting last to null
                return d1.next;
            }
          }
    
