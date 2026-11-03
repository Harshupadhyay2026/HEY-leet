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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode temp = list1;
       
        for (int i=1;i<a;i++){
            temp= temp.next;
        }
            ListNode newhead =temp; 

          temp = list1;
         for (int i=0;i<b;i++){
            temp= temp.next;
        }
             ListNode newtail =temp.next; 

          temp = list2;
        while(temp.next!=null){
          temp = temp.next;
        }
         

            newhead.next = list2;
            temp.next =newtail;

            return list1;
    }
}