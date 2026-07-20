package org.leetcode.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

//    public int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> hashTable = new HashMap<>();
//        int longest = 0;
//
//        int currentLongest = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            Integer dupI = hashTable.getOrDefault(c, -1);
//            if (dupI != -1 && dupI >= (i - currentLongest)) {
//                currentLongest = i - dupI;
//            } else {
//                currentLongest++;
//            }
//            longest = Math.max(longest, currentLongest);
//            hashTable.put(c, i);
//        }
//
//        return longest;
//    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hashTable = new HashMap<>();
        int longest = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            Integer foundAtIndex = hashTable.getOrDefault(c, -1);
            hashTable.put(c, right);
            if (foundAtIndex != -1 && foundAtIndex >= left) {
                left = foundAtIndex + 1;
            }
            longest = Math.max(longest, (right - left) + 1);
        }

        return longest;
    }
}
