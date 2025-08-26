package org.leetcode.longest_palindromic_substring;

public class Solution {

    Boolean isPalindrome(String s) {
        if (s.length() == 1) return true;

        for (int i = 0; i <= (double) (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public String longestPalindrome(String s) {
        String longestPalindrome = "";

        for (int i = 1; i <= s.length(); i++) {
            boolean foundForWindow = false;
            for (int j = 0; (j + i) <= s.length() && !foundForWindow; j++) {
                String substring = s.substring(j, j + i);

                if (isPalindrome(substring)) {
                    longestPalindrome = substring;
                    foundForWindow = true;
                }
            }
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}
