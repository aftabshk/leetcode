package org.leetcode.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shouldPass() {
        Assertions.assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, new Solution().lengthOfLongestSubstring("bbbb"));
        Assertions.assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(5, new Solution().lengthOfLongestSubstring("cadbzabcd"));
        Assertions.assertEquals(5, new Solution().lengthOfLongestSubstring("abcde"));
    }
}