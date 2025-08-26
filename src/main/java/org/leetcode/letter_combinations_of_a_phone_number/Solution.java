package org.leetcode.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {

    List<String> allCombinations(List<List<String>> keypad, String appendStr, List<String> result) {
        List<String> firstNum = keypad.get(0);

        if (keypad.size() != 1) {
            for (String s : firstNum) {
                result = allCombinations(keypad.subList(1, keypad.size()), appendStr + s, result);
            }
            return result;
        }
        for (String s: firstNum) {
            result.add(appendStr + s);
        }

        return result;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return List.of();

        Map<String, List<String>> digitToLetters = Map.of(
                "2", List.of("a", "b", "c"),
                "3", List.of("d", "e", "f"),
                "4", List.of("g", "h", "i"),
                "5", List.of("j", "k", "l"),
                "6", List.of("m", "n", "o"),
                "7", List.of("p", "q", "r", "s"),
                "8", List.of("t", "u", "v"),
                "9", List.of("w", "x", "y", "z")
        );

        List<List<String>> keypad = Arrays.stream(digits.split("")).map(digitToLetters::get).toList();

        return allCombinations(keypad, "", new ArrayList<>());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> strings = solution.letterCombinations("234");

        System.out.println(strings);
    }
}
