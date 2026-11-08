class Solution {
    public String removeDuplicateLetters(String s) {
     int n = s.length();

     int []freq = new int [26];
      boolean [] isvisited = new boolean [26];
      Stack<Character> st = new Stack<>();

     for (int i = 0;i<n; i++){
       char ch = s.charAt(i);
       freq[ch-'a']++;     //count frequency
     }

       for (int i = 0;i<n; i++){
        char ch = s.charAt(i);

        freq[ch-'a']--;  //reduce count at every time

        if(isvisited[ch-'a']){continue;} 

       while(!st.isEmpty()&&
              st.peek()>ch &&
              freq[st.peek()-'a']>0){

           isvisited[st.pop()-'a']=false;
              }

              st.push(ch);
               isvisited[ch-'a'] = true;
       }
       StringBuilder ans = new StringBuilder() ;
       while (!st.isEmpty()){
        ans.append(st.pop());
       }
       return ans.reverse().toString();
    }
}
