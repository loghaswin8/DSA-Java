package recursion.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
        public static List<String> letterCombinations(String digits) {
            if (digits.isEmpty()) return Collections.emptyList();

            String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            List<String> output = new ArrayList<>();

            backTrack("", digits, phone_map, output);
            return output;
        }

        static void backTrack(String combination, String next_digits, String[] phoneMap, List<String> output) {
            if (next_digits.isEmpty()) {
                output.add(combination);
            } else {
                String letters = phoneMap[next_digits.charAt(0) - '2'];
                for (char letter: letters.toCharArray()) {
                    backTrack(combination + letter, next_digits.substring(1), phoneMap, output);
                }

            }

        }

}
