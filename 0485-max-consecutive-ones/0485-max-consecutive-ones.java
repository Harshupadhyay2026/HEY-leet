class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int j = 0;
        int count =0;
        int max = 0;
        while (j<nums.length){
            
 if (nums[j] !=1){
    j++;
    count =0;}
    else{
    count++;
    if (count > max){
    max = count;}
    j++;}

 }return max;
        }
        
    }
