class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        int st = 1;
        while(st <= n) {
            if(st % 3 == 0 || st % 5 == 0|| st % 7 == 0) {
                sum += st;
            }
            st++;
        }
        return sum;
    }
}