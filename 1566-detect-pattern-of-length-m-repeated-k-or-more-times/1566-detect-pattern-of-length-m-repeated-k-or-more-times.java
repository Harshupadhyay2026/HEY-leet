class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int j= m;
        int i =0;
        int count = 0;
        while(j<arr.length){
            if (arr[i]==arr[j]){
                 count++;
            }
            else {
                    count = 0;
                 }
            if (count>=m*(k-1)) return true; //pahle check krenge tb bdhane ka sochnege
                i++;
                j++;
        }
      
         return false;
    }
}