package org.leetcode.remove_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {3, 2, 2, 3};
        Integer k = solution.removeElement(nums, 3);

        assertEquals(2, k);
        int[] expected = {2, 2};

        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        Integer k = solution.removeElement(nums, 2);

        assertEquals(k, 5);
        int[] expected = {0, 1, 3, 0, 4};

        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void test3() {
        int[] nums = {2, 2};
        Integer k = solution.removeElement(nums, 2);

        assertEquals(0, k);
    }

    @Test
    void test4() {
        int[] nums = {};
        Integer k = solution.removeElement(nums, 2);

        assertEquals(0, k);
    }

    @Test
    void test5() {
        int[] nums = {2, 2, 3};
        Integer k = solution.removeElement(nums, 2);

        assertEquals(1, k);
        int[] expected = {3};

        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void test6() {
        int[] nums = {2};
        Integer k = solution.removeElement(nums, 3);

        assertEquals(1, k);
        int[] expected = {2};

        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}
