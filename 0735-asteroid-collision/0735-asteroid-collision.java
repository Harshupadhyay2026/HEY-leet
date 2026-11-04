class Solution {
    public int[] asteroidCollision(int[] nums) {
       
        Stack <Integer> st = new Stack <>();
        
        for (int i=0;i<nums.length;i++){

        boolean isAlive = true;    //important concept 
        int curr = nums[i];

        while (st.size() >0 && nums[i]<0 && st.peek()>0)  //jb positive negative milega
        {
             if(st.peek()< Math.abs(curr)) st.pop();

             else if (st.peek()==Math.abs(curr)) {
                st.pop();
                isAlive = false;  //issko push ni krenge
                break;
            }
             else{
                isAlive = false; //isko push ni krenge
                break;
            } 
        } 
            if(isAlive)  
            st.push(curr);
        }
        int [] ans = new int[st.size()];
         for (int i = 0;i<st.size();i++){
         ans[i]= st.get(i);
        }
     return ans;
    }
}