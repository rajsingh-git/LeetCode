class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=left;i<=right;i++) {
            int n = i;
            int digitSum = 0;
            int temp = i;

            while(temp > 0) {
                int digit = temp % 10;

                if(digit == 0 || n % digit != 0) {
                    break;
                }

                digitSum++;
                temp /= 10;
            }

            if(digitSum == String.valueOf(n).length()) {
                ans.add(n);
            }
        }
        return ans;
    }
}