class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = head;
        
            while (curr != null){
                fwd = curr.next;
                curr.next = prev;
                prev =curr;
                curr = fwd;
            } return prev;
        }}










       // ArrayList <ListNode> arr = new ArrayList<>();
//           ListNode temp = head;
//         while  (temp!=null)
//         {
//             arr.add(temp);
//             temp = temp.next; //creating list to arraylist by traversing a temp;
//         }
//         int n = arr.size(); if( head ==null) return null;
//         for (int i = n-1;i>=1;i--) //traversing lihe array to reverse nodes from last;
//         {
//              ListNode T1 = arr.get(i);
//               ListNode T2 = arr.get (i-1); 
//               T1.next = T2; //connecting nodes while traversing reversly ;
//         }
//         arr.get(0).next = null; 
//         return arr.get(n-1);
//     }
// }
// time complixity 0(n) and space will be 0(n)>>..>...>.>.>>..