class Solution {
    public int differenceOfSums(int n, int m) {
        int st = 1;
        int num1Sum = 0;
        int num2Sum = 0;
        while(st<=n) {
            if(st % m == 0) {
                num2Sum += st;
            } else {
                num1Sum += st; 
            }
        st++;
        }
        return num1Sum-num2Sum;
    }
}