package org.leetcode.utils;

public class ArrayUtils {
    public static void print(int[] nums) {
        System.out.print("[ ");
        for (int n : nums) {
            System.out.print(n + ", ");
        }
        System.out.println("]");
    }
}
