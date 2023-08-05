package org.leetcode.remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0;

        int removedElementsStartsAt = nums.length - 1;
        int i = 0;

        while (i <= removedElementsStartsAt) {
            if (nums[i] == val) {
                int indexOfLastDifferentValue = getIndexOfLastDifferentValue(nums, val, removedElementsStartsAt, i);

                if (indexOfLastDifferentValue != -1) {
                    nums[i] = nums[indexOfLastDifferentValue];
                    nums[indexOfLastDifferentValue] = val;
                    i++;
                }
                removedElementsStartsAt = indexOfLastDifferentValue;
            } else {
                i++;
            }
        }

        return i;
    }

    private static int getIndexOfLastDifferentValue(int[] nums, int val, int start, int end) {
        int i = start;
        while (i != end) {
            if (nums[i] != val) {
                return i;
            } else {
                i--;
            }
        }
        return -1;
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
