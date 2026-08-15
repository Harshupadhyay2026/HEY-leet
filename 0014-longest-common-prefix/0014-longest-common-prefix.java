class Solution {
    public String longestCommonPrefix(String[] strs) {
      String   prefix = strs[0];
      for (int i =1;i<strs.length;i++){
        while (!strs[i].startsWith(prefix)){
           int length =  prefix.length ();
           int newlength = length -1;
          prefix = prefix.substring(0,newlength);}}return prefix;
        }

      }
       