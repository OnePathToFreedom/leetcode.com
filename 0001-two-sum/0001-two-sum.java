class Solution {
    public int[] twoSum(int[] nums, int target) {
      int number = 0;
     for(int i = 0; i < nums.length; i++) {
        for(int j = i + 1; j < nums.length; j++) {
          if(target - nums[i] == nums[j]) return new int[]{i, j};  
        }
     }  
     return new int[]{-1, -1}; 
    }
}