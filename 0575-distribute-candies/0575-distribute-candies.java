class Solution {
    public int distributeCandies(int[] arr) {
        int n =arr.length;
        int min = n/2;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        int uniqueOptions = set.size();

       //unique option or jitna kha sekti hai-->>do me se min ;
         min = Math.min(min,uniqueOptions);
        
    return min;
        
    }
}