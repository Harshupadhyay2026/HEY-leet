class Solution {
    public int largestRectangleArea(int[] arr) {
         int n = arr.length;

        Stack<Integer> st = new Stack<>(); 

     int [] nse = new int [n];      //finding next smaller element 
         nse[n-1]= n;//ek jyada undex lenge
         st.push(n-1);
        for (int i=n-2;i>=0;i--){
        while (st.size()>0 && arr[st.peek()]>=arr[i]) { 
        st.pop();
        }
        if (st.size()==0)   nse[i]=n;
        else  nse[i]= st.peek();
         st.push(i);    
    }

     while(st.size()>0) st.pop();  //stack ko khali krenge

        int [] pse = new int [n];   //finding previous smaller index
         pse[0]=-1; //ek kAM INDEX LENGE
         st.push(0);
        for (int i=1;i<n;i++){
        while (st.size()>0 && arr[st.peek()]>=arr[i]) { 
        st.pop();
        }
        if (st.size()==0)   pse[i]=-1;
        else  pse[i]= st.peek();
         st.push(i);    
    }

    int maxarea = 0;           
    for (int i= 0;i<n;i++){
    int area = arr[i]*(nse[i]-pse[i]-1);   //formula for finding area max
    maxarea = Math.max(maxarea,area);
} 
  return maxarea;
       
    }
}