import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int maxPro1 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        
        int maxPro2 = nums[0] * nums[1] * nums[nums.length-1];
    
        return Math.max(maxPro1 , maxPro2);
    }
}