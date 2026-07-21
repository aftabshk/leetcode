package org.leetcode.max_consecutive_ones_III;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shouldPass() {
        Assertions.assertEquals(6, new Solution().longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        Assertions.assertEquals(10, new Solution().longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        Assertions.assertEquals(4, new Solution().longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1}, 0));
    }
}