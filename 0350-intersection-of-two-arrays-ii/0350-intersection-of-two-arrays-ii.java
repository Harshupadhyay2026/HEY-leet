class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      HashMap<Integer,Integer> map = new HashMap<>();
      ArrayList<Integer> ans = new ArrayList<>();
          
        for(int ele: nums1){
           map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for (int ele : nums2){

            if(map.containsKey(ele)){
               int freq = map.get(ele);
               if (freq >0) { 
                   ans.add(ele);
                  //here we put and update map2;   
                   map.put(ele, freq - 1);
               }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
}