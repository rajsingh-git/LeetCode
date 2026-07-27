class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int n = 0; n < nums.length; n++) {
            if (nums[n] > max1) {
                max2 = max1;
                max1 = nums[n];
            } else if (nums[n] > max2) {
                max2 = nums[n];
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}