class Solution {
    public String toLowerCase(String s) {
// uppercase ; 65 to 90
// lowercase ;;97 to 122;
// hence ; for A to a >>>>>> 32 +uppercase = lowersase...
        String res = "";

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(65 <= ch && ch <= 90){
                res += (char)(ch + 32);
            }
            else{
                res += ch;
            }
        }

        return res;
    }
}