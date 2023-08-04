package org.leetcode.merge_sorted_array;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m + n];

        for (int i = 0, j = 0, k = 0; k < nums1.length; ) {
            if (j >= n) {
                sorted[k++] = nums1[i++];
            } else if (i >= m) {
                sorted[k++] = nums2[j++];
            } else if (nums1[i] > nums2[j]) {
                sorted[k++] = nums2[j++];
            } else {
                sorted[k++] = nums1[i++];
            }
        }

        System.arraycopy(sorted, 0, nums1, 0, sorted.length);
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        new Solution().merge(nums1, 1, new int[]{}, 0);
        for (int n : nums1) {
            System.out.println(n);
        }
    }
}
