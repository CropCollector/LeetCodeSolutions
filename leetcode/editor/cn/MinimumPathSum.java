package leetcode.editor.cn;

import java.util.Arrays;

//Java：最小路径和
public class MinimumPathSum {
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
        // TO TEST
        System.out.println(solution.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int minPathSum(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                dp[i][0] = grid[i][0] + (i == 0 ? 0 : dp[i - 1][0]);
            }
            for (int i = 0; i < n; i++) {
                dp[0][i] = grid[0][i] + (i == 0 ? 0 : dp[0][i - 1]);
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
            return dp[m - 1][n - 1];
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}