package org.leetcode.remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[k] = nums[i];
            if (nums[i] != val) {
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new Solution().removeElement(nums, 2));
        for (int i :
                nums) {
            System.out.println(i);
        }
    }
}
