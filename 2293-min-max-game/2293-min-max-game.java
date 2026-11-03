class Solution {
    public int minMaxGame(int[] nums) {
       int n = nums.length;
        int i = 0;
        int j= 1;
        int []newnums = new int[n/2];
        int index = 0;

        if (n==1) return nums[0];  //base case
        while(j<n){
            if (index%2==0) newnums[index] = Math.min(nums[i],nums[j]);
             else  newnums[index] = Math.max(nums[i],nums[j]);
             index++;
             i= i+2;
             j=j+2;
        }

     return minMaxGame(newnums);
        
    }
}