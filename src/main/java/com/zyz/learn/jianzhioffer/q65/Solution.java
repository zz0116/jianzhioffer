package com.zyz.learn.jianzhioffer.q65;

/**
 * 回溯法
 *
 * @author ZhangYuanzhuo
 * @since 2017/10/10
 */
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (str == null || rows <= 0 || cols <= 0) {
            return false;
        }
        // 路径记录
        boolean[][] visited = new boolean[rows][cols];

        // 最外层循环
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 每一个起点
                if (helper(matrix, rows, cols, str, 0, visited, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean helper(char[] matrix, int rows, int cols,
                           char[] str, int cur, boolean[][] visited, int curx, int cury) {
        if (curx < 0 || curx >= rows || cury < 0 || cury >= cols ||
                visited[curx][cury] || matrix[curx * cols + cury] != str[cur]) {
            return false;
        }
        if (cur == str.length - 1) {
            return true;
        }
        visited[curx][cury] = true;
        boolean flag =
                helper(matrix, rows, cols, str, cur + 1, visited, curx - 1, cury) ||
                helper(matrix, rows, cols, str, cur + 1, visited, curx + 1, cury) ||
                helper(matrix, rows, cols, str, cur + 1, visited, curx, cury - 1) ||
                helper(matrix, rows, cols, str, cur + 1, visited, curx, cury + 1);
        visited[curx][cury] = false;
        return flag;
    }
}