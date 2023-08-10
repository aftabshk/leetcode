package org.leetcode.rotate_array;

import org.leetcode.utils.ArrayUtils;

public class Solution {

    public void rotate(int[] nums, int k) {
        int rotateBy = k % nums.length;

        if (rotateBy == 0) return;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int newIndex = getNewIndex(i, rotateBy, nums.length);
            result[newIndex] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    private static int getNewIndex(int i, int rotateBy, int length) {
        return (i + rotateBy) % length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        new Solution().rotate(nums, 6);
        ArrayUtils.print(nums);
    }
}
