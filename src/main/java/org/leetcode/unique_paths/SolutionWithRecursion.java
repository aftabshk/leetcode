package org.leetcode.unique_paths;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class SolutionWithRecursion {

    private Map<Point, Integer> paths = new HashMap<>();

    public int uniquePaths(int m, int n, int gridLimitM, int gridLimitN) {
        if (m >= gridLimitM || n >= gridLimitN) return 0;
        if (m == gridLimitM - 1 && n == gridLimitN - 1) return 1;
        Point point = new Point(m, n);
        if (paths.containsKey(point)) return paths.get(point);

        int pathsFromRight = uniquePaths(m + 1, n, gridLimitM, gridLimitN);
        int pathsFromDown = uniquePaths(m, n + 1, gridLimitM, gridLimitN);

        int pathsCount = pathsFromRight + pathsFromDown;
        paths.putIfAbsent(point, pathsCount);

        return pathsCount;
    }

    public int uniquePaths(int m, int n) {
        return uniquePaths(0, 0, m, n);
    }

    public static void main(String[] args) {
        System.out.println(new SolutionWithRecursion().uniquePaths(3, 7));
    }

    class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
