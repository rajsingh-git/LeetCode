class Solution {
    public long removeZeros(long n) {

        StringBuilder ans = new StringBuilder();

        while(n>0) {
            if(n%10==0) {
                n/=10;
            } else {
                ans.append(n%10);
                n /= 10;
            }
        }
        ans.reverse();
        return Long.parseLong(ans.toString());
    }
}