class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int required_number = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == required_number) return new int[] {i, j};
            }
        } 
        return new int[] {};
    }
}