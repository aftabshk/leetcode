package org.leetcode.majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        int result = -1;

        for (int num : nums) {
            int count = counter.getOrDefault(num, 0);
            counter.put(num, count + 1);

            if (isMajorityElement(count + 1, nums.length)) return num;
        }

        return result;
    }

    private static boolean isMajorityElement(int count, int length) {
        return count > length / 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{3, 3, 3, 4, 4}));
    }
}
