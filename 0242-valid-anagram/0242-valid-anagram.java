class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
        return false; 
        char [] arr = s.toCharArray();
         char [] tree = t.toCharArray();
         Arrays.sort(arr);
         Arrays.sort(tree);
         return Arrays.equals(arr,tree);
    }
}