class Solution {
    public String removeKdigits(String num, int k) {
          int n = num.length();

          char[] arr= num.toCharArray();

          Stack<Character> st = new Stack<>();

          if (n<=k) return "0";
          
          int count = 0; 
          for(int i= 0;i<n;i++) {

            char curr= arr[i];

            while(st.size()>0 
            && count<k
            && st.peek()>curr) {
            
            st.pop();
            count++;
    }
             st.push(curr) ;  
    }
   
   //if all number is greater then prev one 
       while(count<k) {
        st.pop();
         count++;
        } 

    //Convert Stack into String -->>>>
     StringBuilder sb = new StringBuilder();
    for (char ch: st ){
     sb.append(ch);
}

//remove leading zeros

int i=0;
while(i<sb.length() && sb.charAt(i)=='0') i++;

String ans = sb.substring(i);
return ans.isEmpty()?"0":ans;


    }
}