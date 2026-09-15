class Solution {
    public int countDigits(int n) {
        int d = 0; int count = 0;int original = n;
        while (n>0){
d = n %10;
if ( original % d ==0) { count ++;}
n/=10 ;}


        return count;
        
    }
}