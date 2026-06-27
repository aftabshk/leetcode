package org.leetcode.pascals_triangle_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionWithIteration {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            int[] nextRowArr = new int[i + 1];
            Arrays.fill(nextRowArr, 0);
            List<Integer> nextRow = new ArrayList<>();

            for (int n : nextRowArr) {
                nextRow.add(n);
            }

            for (int j = 0; j < result.size(); j++) {
                Integer num = result.get(j);

                nextRow.set(j, nextRow.get(j) + num);
                nextRow.set(j + 1, nextRow.get(j + 1) + num);
            }

            result = nextRow;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SolutionWithIteration().getRow(3));
    }
}
