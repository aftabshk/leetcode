package org.leetcode.pascals_triangle_2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return List.of(1);
        ArrayList<List<Integer>> memo = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>(i + 1);

            for (int j = 0; j < (i + 1); j++) {
                row.add(null);
            }
            memo.add(row);
        }

        return pascalTriangle(rowIndex, memo).get(rowIndex);
    }

    public List<List<Integer>> pascalTriangle(int rowIndex, List<List<Integer>> memo) {
        for (int i = 0; i <= rowIndex; i++) {
            Integer columnMinusOne = getCell(rowIndex - 1, i - 1, memo);
            if (i - 1 >= 0)
                memo.get(rowIndex - 1).set(i - 1, columnMinusOne);

            Integer column = getCell(rowIndex - 1, i, memo);
            if (i < rowIndex)
                memo.get(rowIndex - 1).set(i, column);
            memo.get(rowIndex).set(i, columnMinusOne + column);
        }

        return memo;
    }

    public Integer getCell(Integer rowIndex, Integer columnIndex, List<List<Integer>> memo) {
        if (rowIndex < 0) return 0;
        if (columnIndex < 0 || rowIndex + 1 == columnIndex) return 0;
        if (rowIndex == 0 && columnIndex == 0) return 1;
        List<Integer> row = memo.get(rowIndex);
        Integer val = row.size() > columnIndex ? row.get(columnIndex) : null;
        if (val != null) return val;

        Integer columnMinusOne = getCell(rowIndex - 1, columnIndex - 1, memo);
        if (rowIndex - 1 >= 0 && columnIndex - 1 >= 0)
            memo.get(rowIndex - 1).set(columnIndex - 1, columnMinusOne);
        Integer column = getCell(rowIndex - 1, columnIndex, memo);
        if (rowIndex - 1 >= 0 && columnIndex < rowIndex)
            memo.get(rowIndex - 1).set(columnIndex, column);

        System.out.println(memo);

        return columnMinusOne + column;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getRow(6));
    }
}
