class Solution {
    public int singleNumber(int[] nums) {
        int xsorsum =0;
for(int i = 0;i <nums.length; i++ )
xsorsum = xsorsum ^ nums[i];
        return xsorsum;
    }
}