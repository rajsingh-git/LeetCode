class Solution {
    public int calPoints(String[] operations) {

        int[] ans = new int[operations.length];
        int size = 0;
        int finalScore = 0;

        for (int i = 0; i < operations.length; i++) {

            switch (operations[i]) {

                case "+":
                    ans[size] = ans[size - 1] + ans[size - 2];
                    size++;
                    break;

                case "D":
                    ans[size] = ans[size - 1] * 2;
                    size++;
                    break;

                case "C":
                    size--;
                    break;

                default:
                    ans[size] = Integer.parseInt(operations[i]);
                    size++;
                    break;
            }
        }

        for (int i = 0; i < size; i++) {
            finalScore += ans[i];
        }

        return finalScore;
    }
}