class Solution {
    public int minimumPushes(String word) {
        int minType = 0;

        for(int i=0;i<word.length();i++) {
            minType += (i/8) + 1;
        }
        return minType; 
    }
}