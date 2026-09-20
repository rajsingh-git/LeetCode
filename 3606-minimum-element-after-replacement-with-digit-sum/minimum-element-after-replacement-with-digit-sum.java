class Solution {
    public int minElement(int[] nums) {
        int minEle = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++) {
            int n = nums[i];
            int digitSum = 0;
            while(n > 0) {
                digitSum += n % 10;
                n = n / 10;
            }
            minEle = Math.min(minEle, digitSum);
        }
        return minEle;
    }
}