class Solution {
    public boolean detectCapitalUse(String word) {
       int count = 0;
        for (int i = 0;i<word.length();i++){
            if (Character.isUpperCase(word.charAt(i))){
            count++;}}
           if  (count ==word.length() || count ==0) return true;
           if (Character.isUpperCase(word.charAt(0)) && count == 1) return true;
           if( count ==0 ){ return true;}
            


        
        return false;
        }
}