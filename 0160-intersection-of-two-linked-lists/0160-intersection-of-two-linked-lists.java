
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;int len1=0;
        while (temp!= null){
       temp = temp.next;
       len1 ++;
        }
          temp = headB;int len2=0;
        while (temp!= null){
       temp = temp.next;
       len2++;
        }
        if (len1>len2){
            for (int i=0;i<len1-len2;i++){
                headA= headA.next;

            }}
            if (len1<len2){
            for (int i=0;i<len2-len1;i++){
                headB= headB.next;     
        }}
         while (headA!= null && headB!=null){
            if (headA == headB)
       return headA;
       headA = headA.next;
       headB = headB.next;
       
       
    }return null;}}
