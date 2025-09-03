package org.leetcode.pascals_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {

    // Solution with loops
    public List<List<Integer>> generate1(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i - 1 < 0 || j - 1 < 0 || j >= result.get(i - 1).size()) {
                    row.add(1);
                    continue;
                }

                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }

            result.add(row);
        }

        return result;
    }

    // Solution with recursion
    public List<List<Integer>> generate2(int numRows) {

        if (numRows == 1) {
            return Stream.of(List.of(1)).collect(Collectors.toList());
        }

        List<List<Integer>> rows = generate2(numRows - 1);
        List<Integer> nMinus1Row = rows.get(rows.size() - 1);
        System.out.println(nMinus1Row);
        List<Integer> nRow = Arrays.stream(new Integer[] {1}).collect(Collectors.toList());
        for (int i = 1; i < nMinus1Row.size(); i++) {
            nRow.add(nMinus1Row.get(i - 1) + nMinus1Row.get(i));
        }

        nRow.add(1);

        rows.add(nRow);
        return rows;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().generate1(5));
        System.out.println(new Solution().generate2(3));
    }
}