package org.nanda.leetcode.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_30 {

    public List<Integer> findSubstring(String s, String[] words) {
        // Handle edge case

        NavigableSet

        if (words.length == 0 || s.length() == 0) {
            return Collections.emptyList();
        }

        int windowSize = 0;
        // Put words into HashSet for O(1) lookup
        Set<String> wordsSet = new HashSet<>();
        // Result
        List<Integer> result = new ArrayList<>();
        int wordSize = words[0].length();

        for (String word : words) {
            windowSize += word.length();
            wordsSet.add(word);
        }

        if (s.length() < windowSize) {
            return Collections.emptyList();
        }



        for (int i = 0; i < s.length(); i++) {
            int end = i + windowSize - 1;
            if (end > s.length()) {
                break;
            }

            Set<String> currentWindow = getCurrentWindowWords(s, i, end, wordSize);
            if (wordsSet.equals(currentWindow)) {
                result.add(i);
            }
        }
        return result;
    }

    private Set<String> getCurrentWindowWords(String originalString, int start, int end, int size) {
        Set<String> words = new HashSet<>();
        for (int i = start; i < end; i = i + size) {
            words.add(originalString.substring(i, i + size));
        }
        return words;
    }
}
