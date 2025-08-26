package org.leetcode.minimum_size_subarray_sum;

public class Solution {

    public static final int[] i = {10,5,13,4,8,4,5,11,14,9,16,10,20,8};

    public static int minSubArrayLen(int target, int[] nums) {
        int minSubArrayLen = 0;
        int lessThanIndexEnd = 1;

        for (int window = nums.length; window > 0; window--) {
            boolean foundForThisWindow = false;

            for (int i = lessThanIndexEnd - 1; (i + window) <= nums.length && !foundForThisWindow; i++) {
                int sum = 0;
                for (int j = i; j < (i + window); j++) {
                    sum += nums[j];
                }

                if (sum >= target) {
                    minSubArrayLen = window;
                    foundForThisWindow = true;
                    lessThanIndexEnd = i + 1;
                } else {
                    lessThanIndexEnd = (i + window) - 1;
                }
            }
        }

        return minSubArrayLen;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(80, i));
    }
}
