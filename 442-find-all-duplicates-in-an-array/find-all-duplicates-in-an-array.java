class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            int targetIndex = val - 1;

            if (nums[targetIndex] < 0) {
                result.add(val);
            } else {
                nums[targetIndex] = -nums[targetIndex];
            }
        }
        
        return result;
    }
}