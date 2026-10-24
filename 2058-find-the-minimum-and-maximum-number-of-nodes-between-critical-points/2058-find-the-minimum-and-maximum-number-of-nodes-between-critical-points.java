
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] ans = {-1,-1};
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;
        if (c==null) return ans;  //2 size ki linked list

        int indx = 1;
       int findx = -1;
       int  lindx = -1, mindist = Integer.MAX_VALUE;
        while(c!=null){
   //check for critical point
        if((b.val >a.val && b.val>c.val) || (b.val <a.val && b.val<c.val)){
            
            if (findx ==-1) findx = indx;

           if(lindx!=-1){
            int dist = indx -lindx;
            mindist = Math.min(dist,mindist); //minimum distance 
           }

           lindx = indx; 
        }
        indx++;
        a =a.next;
        b = b.next;
        c = c.next;
    }
    int maxdist = lindx - findx;
    
    if (maxdist ==0) maxdist =-1;
    if (mindist ==Integer.MAX_VALUE) mindist = -1;

    ans[0]= mindist;
    ans[1]=maxdist;
    return ans;
}
}