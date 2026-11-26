class Solution {
    public boolean canAliceWin(int n) {
        int cAlice = 0;
        int cBob = 0;
        int turn = 10;
        boolean aliceTurn = true;

        while (n >= turn && turn > 0) {
            n -= turn;
            if (aliceTurn) {
                cAlice++;
            } else {
                cBob++;
            }
            turn--;
            aliceTurn = !aliceTurn;
        }
        return cAlice > cBob;
    }
}