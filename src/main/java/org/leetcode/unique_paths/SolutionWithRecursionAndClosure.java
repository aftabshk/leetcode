package org.leetcode.unique_paths;

@FunctionalInterface
interface UniquePaths {
    int uniquePaths(int m, int n, int gridLimitM, int gridLimitN);
}

class SolutionWithRecursionAndClosure {

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        return new UniquePaths() {

            @Override
            public int uniquePaths(int m, int n, int gridLimitM, int gridLimitN) {
                if (m >= gridLimitM || n >= gridLimitN) return 0;
                if (m == gridLimitM - 1 && n == gridLimitN - 1) return 1;
                if (grid[m][n] != 0) return grid[m][n];

                int pathsFromRight = uniquePaths(m + 1, n, gridLimitM, gridLimitN);
                int pathsFromDown = uniquePaths(m, n + 1, gridLimitM, gridLimitN);

                int pathsCount = pathsFromRight + pathsFromDown;
                grid[m][n] = pathsCount;

                return pathsCount;
            }
        }.uniquePaths(0, 0, m, n);
    }

    public static void main(String[] args) {
        System.out.println(new SolutionWithRecursionAndClosure().uniquePaths(5000, 10000));
    }
}
