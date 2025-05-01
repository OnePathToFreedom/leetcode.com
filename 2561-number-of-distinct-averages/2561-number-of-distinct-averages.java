class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        HashSet<Double> hs = new HashSet<>();

        while(left < right) {
            hs.add((double)(nums[left] + nums[right]) / 2);
            left++;
            right--;
        }
        return hs.size();
    }
}