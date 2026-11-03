class Solution {
    public int[] dailyTemperatures(int[] nums) {

     Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int [] nge = new int[n];
        nge[n-1]=0;
        st.push(n-1);    //approach--->>> stores the indexes not values in stack

         for (int i=n-2; i>=0; i--){
            int count = 0;
         while( st.size()>0 && nums[i]>=nums[st.peek()])
        {
            st.pop();
        }
        if(st.size()==0){
            nge[i]= 0;
        }
        else
        nge[i]=st.peek()-i;
        
        st.push(i);
    }
        return nge;
    }
}
    
