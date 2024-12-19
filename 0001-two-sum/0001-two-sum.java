class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {                    //for(int j = 0; j < nums.length; j++) {
                if(nums[j] == requiredNum) return new int[]{i, j};             //if(nums[j] == requiredNum && i != j) return new int[]{i, j};
            }                                                                    // this condition made from 32 ms -> 84 ms
        }
        return new int[]{-1,-1};
    }
}
