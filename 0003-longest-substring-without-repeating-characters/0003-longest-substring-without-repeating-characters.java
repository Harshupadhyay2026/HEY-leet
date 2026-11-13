import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
       
       
           HashSet<Character> set = new HashSet<>(); //HASHSET WITH SLIDING WINDOW

            int i = 0,j = 0;
             int maxLen =0;

            while(j<n){
                char ch = s.charAt(j);

                if (!set.contains(ch)) {
                set.add(ch);
                j++;
        }
        else{
            int len = j-i;
            maxLen = Math.max(maxLen,len);

            while(s.charAt(i)!=s.charAt(j)){
                set.remove(s.charAt(i));
                i++;
            }
            i++;
            j++;
        }    
 }
            int len = j-i;
            maxLen = Math.max(maxLen,len);
            return maxLen;
          
}}