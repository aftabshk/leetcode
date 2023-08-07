package org.leetcode.remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int currentVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[k] = nums[i];
            if (nums[i] != currentVal) {
                k++;
                currentVal = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Solution().removeDuplicates(nums));
        for (int i :
                nums) {
            System.out.println(i);
        }
    }
}
