class Solution {
    public int findPeakElement(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        int max = Integer.MIN_VALUE;
        
        while(st < end) {
            int mid = st + (end-st) / 2;
            if(nums[mid] < nums[mid+1]) {
                st = mid+1;
            } else {
                end = mid;
            }
        }
        return st;
    }
}