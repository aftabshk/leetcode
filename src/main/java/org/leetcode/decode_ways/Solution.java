package org.leetcode.decode_ways;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> indexCounts = new HashMap<>();

    public int numDecodings(String s, Integer index) {
        int count = 0;

        if (indexCounts.get(index) != null) return indexCounts.get(index);

        boolean allSinglesPossible = true;
        for (int i = 0; i < s.length() && allSinglesPossible; i++) {
            if (s.charAt(i) - '0' == 0) {
                allSinglesPossible = false;
            }
        }

        if (allSinglesPossible) count += 1;

        for (int i = 0, j = i + 1; i < s.length() - 1 && j < s.length(); i++, j++) {
            int num = Integer.parseInt("" + s.charAt(i) + s.charAt(j));

            if (s.charAt(i) == '0') return count;

            if (num <= 26) {
                String substring = s.substring(j + 1);
                if (substring.isEmpty()) count += 1;
                else count += numDecodings(substring, index + j + 1);
            }
        }

        indexCounts.put(index, count);

        return count;
    }

    public int numDecodings(String s) {
        return numDecodings(s, 0);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numDecodings("111111111111111111111111111111111111111111111"));
    }
}