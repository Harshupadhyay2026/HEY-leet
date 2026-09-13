
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> take = new HashSet<>();
        for (int x : nums) {
            take.add(x);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!take.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}