class Solution {
    public static int dfs(int[][] grid,int i,int j,int n,int m,int [][] memo){
        if(i>=n || j>=m)return Integer.MAX_VALUE;
        if (i == n - 1 && j == m - 1) return grid[i][j];
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int down = dfs(grid,i+1,j,n,m,memo);
        int right = dfs(grid,i,j+1,n,m,memo);
        int minPath = Math.min(down, right);
        if (minPath == Integer.MAX_VALUE) return Integer.MAX_VALUE;
        memo[i][j] = grid[i][j] + minPath;
        return memo[i][j];
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int memo[][]  = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        return dfs(grid,0,0,n,m,memo);
    }
}