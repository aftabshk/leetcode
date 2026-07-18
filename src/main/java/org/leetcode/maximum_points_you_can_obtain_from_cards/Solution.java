package org.leetcode.maximum_points_you_can_obtain_from_cards;

public class Solution {

    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, max, r = k - 1;

        for (int i = 0; i <= r; i++) {
            sum = sum + cardPoints[i];
        }
        max = sum;

        if (cardPoints.length == k) return max;

        int l = cardPoints.length - 1;
        while (l >= (cardPoints.length - k)) {
            sum = (sum - cardPoints[r]) + cardPoints[l];
            r = r - 1;
            l = l - 1;
            max = Math.max(sum, max);
        }

        return max;
    }

//    public int maxScore(int[] cardPoints, int k) {
//        int sum = 0, max, l = 0, r = k - 1;
//
//        for (int i = 0; i <= r; i++) {
//            sum = sum + cardPoints[i];
//        }
//        max = sum;
//
//        while (l != (cardPoints.length - k)) {
//            sum = sum - cardPoints[r];
//            r = r - 1;
//            l = ((l + cardPoints.length) - 1) % cardPoints.length;
//            sum = sum + cardPoints[l];
//            max = Math.max(sum, max);
//        }
//
//        return max;
//    }
}

