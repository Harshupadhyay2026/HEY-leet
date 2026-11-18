
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the number is already in the set, it's a duplicate
            if (seen.contains(num)) {
                result.add(num);
            } else {
                // Otherwise, add it to the set
                seen.add(num);
            }
        }
        
        return result;
    }
}