class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drink = numBottles;
        int emptyB = numBottles;

        while (emptyB >= numExchange) {

            int newBottles = emptyB / numExchange;

            drink += newBottles;

            emptyB = (emptyB % numExchange) + newBottles;
        }

        return drink;
    }
}