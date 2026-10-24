


class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new  ListNode(0);
         ListNode curr = dummy;
         dummy.next = head;
         
         
         while(curr !=null){
            int sum=0;
             ListNode temp = curr.next;  //important to track prev;
           
            while (temp!=null){
                 sum =sum + temp.val;
             if(sum==0){
                curr.next= temp.next;
                temp= curr.next;
             }
            else{
                temp= temp.next;
            }
         }
         curr = curr.next;
          }
           return dummy.next;
        
    }
}