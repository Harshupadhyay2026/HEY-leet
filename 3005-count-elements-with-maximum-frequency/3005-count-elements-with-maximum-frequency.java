class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int frequency = 0, count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : map.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }
}