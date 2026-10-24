
class Solution {

static ListNode reverse(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    ListNode fwd = null;
    while (curr!= null){
        fwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fwd;
    }
    return prev;
}

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
      ListNode  head2 = slow.next;
                slow.next = null;

       head2 =  reverse(head2);
       
       int max = 0;
       int sum = 0;
       ListNode i = head;
       ListNode j = head2;

       while (j!=null){

        sum = i.val +j.val;
        if (sum>max)  max = sum;
     
       i= i.next;
       j = j.next;}

       
       return max;

    }}
