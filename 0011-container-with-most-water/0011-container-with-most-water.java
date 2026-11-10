class Solution {
    public int maxArea(int[] a) {
        int i =0 ;
        int j = a.length-1;
        int max = 0;

        while(i<j){
           int area = 0;
           
           if (a[i]<=a[j]){

             area = a[i]*(j-i);
            i++;

           }
           else{
             area = a[j]*(j-i);
            j--;
           }
             max =  Math.max(area,max);  
        }
        return max;
    }
}