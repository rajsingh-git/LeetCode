class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int st = 0;
        int end = nums.length - 1;

        while(st <= end) {
            int mid = st + (end - st) / 2;

            if(nums[mid] >= target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

            if(nums[mid] == target) {
                ans[0] = mid;
            }
        }

        st = 0;
        end = nums.length - 1;

        while(st <= end) {
            int mid = st + (end - st) / 2;

            if(nums[mid] <= target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }

            if(nums[mid] == target) {
                ans[1] = mid;
            }
        }

        return ans;
    }
}