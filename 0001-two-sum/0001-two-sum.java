class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int requieredNum = target - nums[i];
            for(int j = i + 1; j < nums.length; j ++) {
                if(nums[j] == requieredNum) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}