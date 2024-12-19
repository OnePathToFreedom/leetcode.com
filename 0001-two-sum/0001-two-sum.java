class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {                            //it was first try
            int requiredNum = target - nums[i];                           //this condition made from 32 ms -> 84 ms
            for(int j = i + 1; j < nums.length; j++) {                    //for(int j = 0; j < nums.length; j++) {
                if(nums[j] == requiredNum) return new int[]{i, j};             //if(nums[j] == requiredNum && i != j) return new int[]{i, j};
            }                                                             
        }
        return new int[]{-1,-1};
    }
}
