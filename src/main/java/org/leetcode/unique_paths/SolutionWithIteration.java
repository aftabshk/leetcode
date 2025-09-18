package org.leetcode.unique_paths;

class SolutionWithIteration {

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

    public static void main(String[] args) {
        System.out.println(new SolutionWithIteration().uniquePaths(10000, 10000));
    }
}
