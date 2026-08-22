class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int number = n;

        while (number > 0) {
            int digit = number % 10;
            digitSum += digit;
            digitProduct *= digit;
            number /= 10;
        }

        int total = digitSum + digitProduct;

        return n % total == 0;
    }
}