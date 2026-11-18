class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int bestDivisor = -1;

        for (int i = 0; i < divisors.length; i++) {
            int div = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    div++;
                }
            }
            
            if (div > maxScore || (div == maxScore && divisors[i] < bestDivisor)) {
                maxScore = div;
                bestDivisor = divisors[i];
            }
        }

        return bestDivisor;
    }
}