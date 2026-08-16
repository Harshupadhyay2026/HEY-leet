class Solution {
    public int maximumGap(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        if (nums.length < 2) return 0;
        int j = 1;
        int i = 0;
        while (j< nums.length){
          ans =  nums [j]- nums [i]  ;
            if (ans > max){
max = ans ;
            }
            j++;
            i++;

        }

        return max;
    }
}