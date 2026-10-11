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
     static ListNode ReverseLinkedList(ListNode head){  // reversing the half list

         ListNode curr = head;
         ListNode fwd = null;
         ListNode prev = null;
         while (curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
         } return prev;}
         
    public boolean isPalindrome(ListNode head) {
 // apllying slow fast approach to break and reverse "a" pointed to slow.next
        ListNode fast = head;
        ListNode slow = head ;
        if (head.next== null) return true;
        while (fast.next!=null  && fast.next.next != null){ 
           
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
         slow.next = null;
         a =  ReverseLinkedList (a); // reversing "a" by calling function

  // checking each value by traversing forward>>>> by two pointer approach
        ListNode i = head;
         ListNode j = a;
         while(j!=null){   
            if (i.val!=j.val) return false;
            i = i.next;
            j = j.next;} return true;

         }}




        
    
