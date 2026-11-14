class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int maxLength=0;

         for (int ele : nums){
            set.add(ele);
        }

        for (int ele : set){

            if (!set.contains(ele-1)) {
               int curr =ele;
               count = 1;
            
            while(set.contains(curr +1)){
                curr++;
                count++;
            }
             maxLength= Math.max(maxLength,count);
      }
        }
    return maxLength;
}     
        
}