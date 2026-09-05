class Solution {
    public void rotate(int[][] matrix) {
         int m = matrix.length;
        // int  n =  matrix[0].length;
//transpose
        for (int i = 0; i<m;i++){

            for (int j = 0; j< i;j++)
        { 
            int temp = matrix[i][j];
            matrix[i][j]=matrix [j][i];
            matrix [j][i]= temp;
        }}
//reversing row
        for (int i = 0; i<m; i++){

     int l= 0;  int  r = matrix[0].length-1;
while (l < r){
            int temp = matrix[i][l];
            matrix[i][l]=matrix [i][r];
            matrix [i][r]= temp;
            l++;
            r--;
}
        
    }}}
