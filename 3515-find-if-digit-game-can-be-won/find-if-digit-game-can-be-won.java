class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOd = 0;
        int sumTd = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 10) {
                sumOd += nums[i];
            } else {
                sumTd += nums[i];
            }
        }
        if(sumOd == sumTd) {
            return false;
        }
        return true;
    }
}