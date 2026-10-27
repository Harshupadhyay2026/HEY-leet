class Solution {
    public ListNode removeNodes(ListNode head) {
       Stack <ListNode> st = new Stack<>();
        ListNode temp = head;
       
     while(temp!=null){ 
        while(st.size()>0 && st.peek().val < temp.val) 
               st.pop(); //underflow s.size> 0

               st.push(temp);  //baki har condition me push krna hai ;
               temp = temp.next; 
    }

      while(st.size()>0){
        ListNode top = st.pop();
        top.next = temp;        //abhi tk temp null p aa gya hoga
        temp = top;
    }
    return temp;
}
}