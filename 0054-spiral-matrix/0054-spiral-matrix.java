import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> ans= new ArrayList<>();
      
       int m = matrix.length; 
       int n = matrix[0].length;
       int tne = m*n;
        int fr = 0 ;
        int fc = 0;
        int lc = n-1;
        int lr = m-1;
        
        while (fc<=lc && fr<=lr ) {
      for (int j = fc ; j<=lc;j++){
       ans.add(matrix[fr][j]);}
       fr++;
       
      
      
       for (int i = fr ; i<=lr;i++){
       ans.add(matrix[i][lc]);}
       lc--;
      
        if (fr<=lr){
        for (int j = lc ; j>=fc;j--){
      ans.add(matrix[lr][j]);}
       lr--;}
      
       if (fc<=lc){
       for (int i = lr ; i>=fr;i--){
       ans.add(matrix[i][fc]);}
       fc++;} 
      
        }
        return ans;
        }}

      

       

        
      

      

 


       

        
      







        
    
