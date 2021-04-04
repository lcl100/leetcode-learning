package 第1684题_统计一致字符串的数目.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // 1.用HashMap存储allowed字符串中的每个字符
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = allowed.toCharArray();
        for (char c : chars) {
            map.put(c, 1);
        }
        // 统计一致字符串的数目
        int wordCount = 0;// 记录一致字符串的数目
        for (String word : words) {
            int count = 0;// 统计word字符串中字符在allowed字符串中出现的次数
            char[] array = word.toCharArray();
            for (char c : array) {
                if (map.getOrDefault(c, 0) != 0) {
                    count++;
                }
            }
            // 如果count和word字符串长度相等，表示word中所有字符都在HashMap中出现过，才能是一致字符串
            if (count == array.length) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
/*
    解题思路：
        1.用HashMap统计allowed字符串中每个字符的出现次数
        2.遍历字符串数组words，然后遍历数组中每个字符串中的每个字符，用该字符去HashMap中查询，如果出现次数为0（即不存在）则跳过该单词的检查，如果都有则进行计数
    思路简述：
        1.即只需要判断words数组每个字符串的字符是否在allowed字符串中出现，如果有字符串中某字符没有出现则不用计数
 */
/*
    执行用时：19 ms, 在所有 Java 提交中击败了44.96% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了67.74% 的用户
 */