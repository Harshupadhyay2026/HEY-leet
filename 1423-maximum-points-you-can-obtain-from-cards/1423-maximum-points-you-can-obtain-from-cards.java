class Solution {
    public int maxScore(int[] arr, int k) {
     int sum = 0;
     int result = 0;
     int low = 0;
     int high = k-1;
     int n = arr.length;

    for (int i = low; i <k;i++){
     sum = sum + arr[i] ;
     }
      low = k-1;
      high = n-1;
      result = sum;

     while (low >= 0){

    sum =sum - arr[low] +  arr [high];
   
    high--;
   
    low--;

    result = Math.max(result,sum) ;

  }

return result ;
        
    }
}