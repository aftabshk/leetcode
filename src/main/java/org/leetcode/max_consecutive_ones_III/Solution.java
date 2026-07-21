package org.leetcode.max_consecutive_ones_III;

import java.util.ArrayList;

public class Solution {

//    public int longestOnes(int[] nums, int k) {
//        int longest = 0;
//        boolean reachedEnd = false;
//        for (int l = 0; !reachedEnd; l++) {
//            for (int i = l, j = k; !reachedEnd; i++) {
//                if (i == nums.length - 1) {
//                    reachedEnd = true;
//                }
//                if (nums[i] == 0) {
//                    --j;
//                }
//                if (j < 0) break;
//                longest = Math.max(longest, (i - l) + 1);
//            }
//        }
//
//        return longest;
//    }

//    public int longestOnes(int[] nums, int k) {
//        int longest = 0;
//        int numberOfZeroes = 0;
//        for (int l = 0, r = 0; r < nums.length; r++) {
//            if (nums[r] == 0 && numberOfZeroes < k) {
//                ++numberOfZeroes;
//            } else if (nums[r] == 0 && numberOfZeroes >= k) {
//                while (nums[l] != 0) {
//                    ++l;
//                }
//                ++l;
//            }
//            longest = Math.max(longest, (r - l) + 1);
//        }
//
//        return longest;
//    }

//    public int longestOnes(int[] nums, int k) {
//        int longest = 0;
//        int numberOfZeroes = 0;
//        ArrayList<Integer> zeroIndexes = new ArrayList<>(nums.length);
//        int currentIndexInZero = 0;
//        for (int l = 0, r = 0; r < nums.length; r++) {
//            if (nums[r] == 0 && numberOfZeroes < k) {
//                zeroIndexes.add(r);
//                ++numberOfZeroes;
//            } else if (nums[r] == 0 && numberOfZeroes >= k) {
//                zeroIndexes.add(r);
//                l = zeroIndexes.get(currentIndexInZero) + 1;
//                ++currentIndexInZero;
//            }
//            longest = Math.max(longest, (r - l) + 1);
//        }
//
//        return longest;
//    }

    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, longest = 0, zeroes = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                ++zeroes;
            }
            if (nums[l] == 0 && zeroes > k) {
                ++l;
                --zeroes;
            }
            else if (zeroes > k) {
                ++l;
            }
            if (zeroes <= k) {
                longest = Math.max(longest, (r - l) + 1);
            }
            ++r;
        }

        return longest;
    }
}
