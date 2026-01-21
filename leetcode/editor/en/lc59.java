/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {

    // 0 1 right, 0 -1 left, 1 0 down, -1 0 up
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int i = 0, j = 0;
        int row = 0, col = 1;

        for (int times = 1; times <= n * n; times++) {
            res[i][j] = times;
            visited[i][j] = true;

            if (row == 0 && col == 1 &&
                    (j + 1 >= n || visited[i][j + 1])) {
                row = 1;
                col = 0;
            } else if (row == 1 && col == 0 &&
                    (i + 1 >= n || visited[i + 1][j])) {
                row = 0;
                col = -1;
            } else if (row == 0 && col == -1 &&
                    (j - 1 < 0 || visited[i][j - 1])) {
                row = -1;
                col = 0;
            } else if (row == -1 && col == 0 && 
                (i - 1 < 0 || visited[i - 1][j])) {
                row = 0;
                col = 1;
            }

            i += row;
            j += col;
        }

        return res;
    }
}
// @lc code=end



/**
class Solution {

    public int[][] generateMatrix(int n) {
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        int count = 1;

        int[][] res = new int[n][n];

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                res[top][j] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res[bottom][j] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = count++;
                }
                left++;
            }
        }

        return res;
    }
}
 */