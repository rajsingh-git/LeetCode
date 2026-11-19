class Solution {
    public int findChampion(int[][] grid) {
        int idx = -1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<grid.length;i++) {
            int sum = 0;
            for(int j=0;j<grid[i].length;j++){
                sum += grid[i][j];
            }
            if(sum > ans) {
                ans = sum;
                idx = i;
            }
        }
        return idx;
    }
}