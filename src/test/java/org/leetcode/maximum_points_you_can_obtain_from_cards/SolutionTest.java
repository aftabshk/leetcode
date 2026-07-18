package org.leetcode.maximum_points_you_can_obtain_from_cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldPass() {
        Assertions.assertEquals(12, new Solution().maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
        Assertions.assertEquals(4, new Solution().maxScore(new int[]{2, 2, 2}, 2));
        Assertions.assertEquals(55, new Solution().maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7));
        Assertions.assertEquals(1129, new Solution().maxScore(new int[]{61, 16, 51, 40, 37, 21, 96, 70, 13, 98, 28, 75, 74, 87, 68, 55, 95, 24, 46, 87}, 19));
    }
}