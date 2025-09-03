package org.leetcode.climbing_stars;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int climbStairs(int n, Map<Integer, Integer> memo) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        } else {
            int stairsCount = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
            memo.put(n, stairsCount);
            return stairsCount;
        }
    }

    public int climbStairs(int n) {

        return climbStairs(n, new HashMap<>());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(4));
        System.out.println(solution.climbStairs(2));
        System.out.println(solution.climbStairs(3));
    }
}