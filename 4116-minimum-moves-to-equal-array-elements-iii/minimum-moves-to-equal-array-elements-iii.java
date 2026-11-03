class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int target = nums[nums.length-1];
        int moves = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] < target) {
                moves += target - nums[i];
            }
        }
        return moves;
    }
}