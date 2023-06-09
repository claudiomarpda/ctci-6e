package org.coding.ctci6e;

import java.util.*;

/**
 * 1.1 Is Unique:
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 * Hints: #44, #777, #732
 */
public class IQ11_IsUnique {

    public boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public boolean isUniqueBySorting(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char previous = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (previous == chars[i]) {
                return false;
            }
            previous = chars[i];
        }
        return true;
    }

    public boolean isUniqueAscii(String s) {
        if  (s.length() > 128) return false;
        boolean[] chars = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (chars[c]) return false;
            chars[c] = true;
        }
        return true;
    }

}
