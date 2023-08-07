package org.leetcode.remove_duplicates_from_sorted_array_2;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int currentVal = nums[0];
        int duplicateCounter = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[k] = nums[i];
            if (duplicateCounter <= 1 && nums[i] == currentVal) {
                k++;
                duplicateCounter++;
            } else if (nums[i] != currentVal) {
                k++;
                duplicateCounter = 1;
                currentVal = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(new Solution().removeDuplicates(nums));
        for (int i :
                nums) {
            System.out.println(i);
        }
    }
}
