package org.leetcode.unique_paths;

class SolutionWithRecursion1 {

    public int uniquePaths(int m, int n, int gridLimitM, int gridLimitN, int[][] grid) {

        if (m >= gridLimitM || n >= gridLimitN) return 0;
        if (m == gridLimitM - 1 && n == gridLimitN - 1) return 1;
        if (grid[m][n] != 0) return grid[m][n];

        int pathsFromRight = uniquePaths(m + 1, n, gridLimitM, gridLimitN, grid);
        int pathsFromDown = uniquePaths(m, n + 1, gridLimitM, gridLimitN, grid);

        int pathsCount = pathsFromRight + pathsFromDown;
        grid[m][n] = pathsCount;

        return pathsCount;
    }

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        return uniquePaths(0, 0, m, n, grid);
    }

    public static void main(String[] args) {
        System.out.println(new SolutionWithRecursion1().uniquePaths(5000, 10000));
    }
}
