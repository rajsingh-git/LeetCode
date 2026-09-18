class Solution {
    public int maximumWealth(int[][] accounts) {
       int richCust = 0;
       for(int i=0;i<accounts.length;i++) {
        int currRich = 0;       
        for(int j=0;j<accounts[i].length;j++) {
            currRich += accounts[i][j];
        }
        richCust = Math.max(currRich , richCust);
       }
       return richCust;
    }
}