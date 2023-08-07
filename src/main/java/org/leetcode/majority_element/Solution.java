package org.leetcode.majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        int result = 0;

        for (int i = 0, j = nums.length - 1; i < Math.ceil(nums.length / 2.0); i++, j--) {
            counter.computeIfPresent(nums[i], (key, val) -> val + 1);
            counter.putIfAbsent(nums[i], 1);
            if (i != j) {
                counter.computeIfPresent(nums[j], (key, val) -> val + 1);
                counter.putIfAbsent(nums[j], 1);
            }
            if (isMajorityElement(counter, nums[i], nums.length)) result = nums[i];
            if (isMajorityElement(counter, nums[j], nums.length)) result = nums[j];
        }

        return result;
    }

    private static boolean isMajorityElement(Map<Integer, Integer> counter, int val, int length) {
        return counter.get(val) > length / 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{3, 3, 3, 4, 4}));
    }
}
