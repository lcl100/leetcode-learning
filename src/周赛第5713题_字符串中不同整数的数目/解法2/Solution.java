package 周赛第5713题_字符串中不同整数的数目.解法2;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        char[] chars = word.toCharArray();
        int i = 0, j = 0;
        while (j < word.length()) {
            while (i < word.length() && (isLetter(chars[i]) /*|| chars[i] == '0'*/)) {
                i++;
            }
            j = i;
            while (j < word.length() && isNumber(chars[j])) {
                j++;
            }
            if (i != j) {
                set.add(word.substring(i, j).replaceAll("^0*", ""));
            }
            i = j;
        }
        return set.size();
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }
}
/*
    解题思路：
        0.双指针
 */
/*
    执行用时: 12 ms
    内存消耗: 38.9 MB
 */