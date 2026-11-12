class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int ele : nums ){
            if (!map.containsKey(ele)) map.put(ele,1) ; 
            else map.put(ele,map.get(ele)+1);
        }

            int pairs = 0;

            for (int ele : map.keySet()){
            int rem1 = ele-k;
            int rem2 = k+ele;

            if(map.containsKey(rem1)) pairs += (map.get(ele))*(map.get(rem1));
            if(map.containsKey(rem2)) pairs += (map.get(ele))*(map.get(rem2));
        }
        return pairs/=2;   
       
    }
}