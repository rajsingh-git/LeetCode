class Solution {
    public int countCommas(int n) {
        int cms = 0;
        if(n<1000) {
            return cms;
        } else {
            cms = n-999;
        }
        return cms;
    }
}