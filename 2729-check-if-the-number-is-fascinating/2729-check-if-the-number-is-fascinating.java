class Solution {
    public boolean isFascinating(int n) {
        String a = Integer.toString(n) + Integer.toString(2 * n) + Integer.toString(3 * n);//imp 

        if (a.length() != 9) return false;
       
        HashSet<Character> set = new HashSet<>();
        
         for (int i = 0; i < 9; i++) {
            char ch = a.charAt(i);
            // Check for '0' or duplicate characters
            if (ch == '0' || set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
    return true;
}}