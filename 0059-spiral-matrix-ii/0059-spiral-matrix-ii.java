class Solution {
    public int[][] generateMatrix(int n) {
     int num = 1;
  
int [][] arr = new int [n][n];
    int m = arr.length; 
       int l = arr[0].length;
       int tne = m*n;
        int fr = 0 ;
        int fc = 0;
        int lc = n-1;
        int lr = m-1;
        
        while (fc<=lc && fr<=lr ) {
      for (int j = fc ; j<=lc;j++){
       arr[fr][j]= num ;
       num++;}       //left to right
       fr++;
       
      
       for (int i = fr ; i<=lr;i++){
       arr[i][lc] = num;
       num++;}       //top to down
       lc--;
      
        if (fr<=lr){
        for (int j = lc ; j>=fc;j--){
      arr[lr][j]= num;
      num++;}        // right to left
       lr--;}
      
       if (fc<=lc){
       for (int i = lr ; i>=fr;i--){
       arr[i][fc]= num;
       num++;}       //down to up
       fc++;} 
      
        }
        return arr;
        }}

      

       

        
      

      

 


       

        
      







        
    


