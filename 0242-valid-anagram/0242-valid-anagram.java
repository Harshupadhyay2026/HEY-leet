class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> maps = new HashMap<>();
        for(char ch : s.toCharArray()){

            if(maps.containsKey(ch)){

                int freq = maps.get(ch);
                maps.put(ch,freq+1);
                }
                else maps.put (ch,1);
            }
        HashMap<Character,Integer> mapt = new HashMap<>();

             for(char ch : t.toCharArray()){

            if(mapt.containsKey(ch)){

                int freq = mapt.get(ch);
                mapt.put(ch,freq+1);
                }
                else mapt.put (ch,1);
            }

           return maps.equals(mapt);
        
    //     if (s.length() != t.length())
    //     return false; 
    //     char [] arr = s.toCharArray();
    //      char [] tree = t.toCharArray();
    //      Arrays.sort(arr);
    //      Arrays.sort(tree);
    //      return Arrays.equals(arr,tree);
    // }
}}