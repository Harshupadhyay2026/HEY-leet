class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int prod = 1;
        for (int i= 0;i<nums.length;i++)
        {
     prod = prod*nums[i];
     if( max < prod){
     max = prod;}
     if (prod == 0){
     prod = 1;}}
     prod =1;
      for (int j= nums.length-1 ;j > 0;j--)
        {
     prod = prod*nums[j];
     if( max < prod){
     max = prod;}
     if (prod == 0){
     prod = 1;}
     
        }if (nums.length ==1){
            max = nums [0];
        }
        return max;
    }

}