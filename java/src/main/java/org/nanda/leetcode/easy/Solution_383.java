package org.nanda.leetcode.easy;

import java.util.Arrays;

class Solution_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        final int[] count = new int[26];
        ransomNote.chars().forEach(c -> ++count[c % 26]);
        magazine.chars().filter(c -> count[c % 26] > 0).forEach(c -> --count[c % 26]);

        return !Arrays.stream(count).filter(c -> c > 0).findAny().isPresent();

    }

    public static void main(String[] args) {
      String ransomNote = "abcdefa";
      String magazine = "aabdkfcdkef";
      System.out.println(new Solution_383().canConstruct(ransomNote, magazine));
    }
}
