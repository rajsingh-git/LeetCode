// class Solution {
//     public int findLHS(int[] nums) {
//         int maxLen = 0;
//         for(int i=0;i<nums.length-1;i++) {
//             ArrayList<Integer> ans = new ArrayList<>();
//             ans.add(nums[i]);
//             for(int j=i+1;j<nums.length;j++) {
//                 if(Math.abs(nums[i] - nums[j]) != 1) {
//                     ans.clear();
//                 } else {
//                     ans.add(nums[j]);
//                 }
//             }
//             maxLen += ans.size();
//         }
//         return maxLen;
//     }
// }

class Solution {
    public int findLHS(int[] nums) {
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean found = false;

            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i] || nums[j] == nums[i] + 1) {
                    count++;
                }

                if(nums[j] == nums[i] + 1) {
                    found = true;
                }
            }

            if(found) {
                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}