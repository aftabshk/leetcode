package org.leetcode.single_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int n : nums) {
            numbers.computeIfPresent(n, (k, o) -> o + 1);
            numbers.putIfAbsent(n, 1);
        }

        return numbers
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
