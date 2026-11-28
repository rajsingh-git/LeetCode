class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        int minDist = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int curr = Math.abs(nums[i]);

            if (curr < minDist) {
                minDist = curr;
                closest = nums[i];
            } else if (curr == minDist) {
                closest = Math.max(closest, nums[i]);
            }
        }

        return closest;
    }
}