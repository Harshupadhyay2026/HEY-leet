class Solution {
    public void rotate(int[] nums, int k) {k = k%nums.length;
        int i=0; int j = nums.length-1;
        while (i< j){
           int temp= nums[i];
           nums[i]=nums[j];
           nums [j]=temp;
           i++;j--;}
           int left =0;int right =k-1;
while (left< right){
          int c=nums[left];
           nums [left]=nums[right];
           nums[right]=c;
           left++;right--;

        }
int lleft =k;int rright=nums.length-1;
        while (lleft< rright){
          int d=nums[lleft];
           nums [lleft]=nums[rright];
           nums[rright]=d;
           lleft++;rright--;}

        
    }
}