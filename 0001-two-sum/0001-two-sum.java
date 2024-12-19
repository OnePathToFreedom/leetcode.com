class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> key = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requieredNum = target - nums[i];
            if (key.containsKey(requieredNum)) return new int[]{key.get(requieredNum), i};
            key.put(nums[i], i);
        }
        return nums;
    }
}