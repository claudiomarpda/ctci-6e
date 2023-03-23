package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.2 Check Permutation:
 * Given two strings, write a method to decide if one is a permutation of the other.
 * Hints: #1, #84, #122, #131
 */
public class IQ12 {

    public boolean permutes(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() != s2.length()) return false;

        var s1Map = getCharFrequencyMap(s1);
        var s2Map = getCharFrequencyMap(s2);

        for (var e1 : s1Map.entrySet()) {
            int frequency1 = e1.getValue();
            int frequency2 = s2Map.getOrDefault(e1.getKey(), 0);
            if (frequency1 != frequency2) return false;
        }

        return true;
    }

    private static Map<Character, Integer> getCharFrequencyMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int frequency = map.getOrDefault(c, 0) + 1;
            map.put(c, frequency);
        }
        return map;
    }

}
