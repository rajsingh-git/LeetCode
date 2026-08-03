class Solution {
    public int minOperations(int[] nums) {
        int minOpn = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] >= nums[i+1]) {
                int diff = nums[i] - nums[i+1] + 1;
                nums[i+1] += diff;
                minOpn += diff;
            }
        }
        return minOpn;
        
    }
}