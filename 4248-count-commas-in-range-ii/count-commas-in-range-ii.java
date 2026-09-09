class Solution {
    public long countCommas(long n) {
        long cms = 0;

        if (n >= 1000)
            cms += n - 999;

        if (n >= 1000000)
            cms += n - 999999;

        if (n >= 1000000000)
            cms += n - 999999999;

        if (n >= 1000000000000L)
            cms += n - 999999999999L;

        if (n >= 1000000000000000L)
            cms += n - 999999999999999L;

        return cms;
    }
}