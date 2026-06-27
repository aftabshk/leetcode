package org.leetcode.unique_paths;

import java.util.Arrays;

class SolutionWithIteration {

    /** Iteration so that there is no limitation of maximum call stack */
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for (int i = m - 1; i > -1; i--) {
            grid[i][n - 1] = 1;
        }

        for (int i = n - 1; i > -1; i--) {
            grid[m - 1][i] = 1;
        }

        for (int i = m - 2; i > -1; i--) {
            for (int j = n - 2; j > -1; j--) {
                grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
            }
        }

        return grid[0][0];
    }

    /** Iteration so that there is no limitation of maximum call stack. With O(n) space complexity */
    public int uniquePaths1(int m, int n) {
        int[][] memo = new int[2][n];

        for (int[] ints : memo) {
            Arrays.fill(ints, 1);
        }

        for (int i = 0; i <= m - 2; i++) {
            for (int j = n - 2; j >= 0; j--) {
                memo[0][j] = memo[1][j] + memo[0][j + 1];
            }
            memo[1] = memo[0];
        }

        return memo[0][0];
    }

    public static void main(String[] args) {
        System.out.println(new SolutionWithIteration().uniquePaths(10000, 10000));
        System.out.println(new SolutionWithIteration().uniquePaths1(3, 3));
        System.out.println(new SolutionWithIteration().uniquePaths1(3, 5));
    }
}
