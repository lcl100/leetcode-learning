package 周赛第5713题_字符串中不同整数的数目.解法1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numDifferentIntegers(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                chars[i] = ' ';
            }
        }
        word = String.valueOf(chars);
        if (word.trim().length() == 0) {
            return 0;
        }
        String[] split = word.trim().split("\\s+");
        Set<String> set = new HashSet<>();
        for (String s : split) {
            set.add(s.replaceAll("^0*",""));
        }
        return set.size();
    }
}