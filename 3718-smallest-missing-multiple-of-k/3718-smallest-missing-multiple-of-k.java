class Solution {
    public int missingMultiple(int[] nums, int k) {

      HashSet <Integer> set = new HashSet<>() ;

       for(int ele: nums){
        set.add(ele);
       }
        int i =1; 
        while(true){
         int ans  = k*i;
        if (!set.contains(ans)) return ans;;
         i++;
     }
    
        
    }
}