package 第389题_找不同.解法4;

import java.util.Arrays;

public class Solution {
    public char findTheDifference(String s, String t) {
        // 1.将字符串转换成字符数组并进行排序
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        // 获取最小长度
        int minLen = Math.min(sChars.length, tChars.length);
        // 循环遍历
        int i;
        for (i = 0; i < minLen; i++) {
            if (sChars[i] != tChars[i]) {
                // 如果不相等，则返回长字符串中对应索引位置的字符，不能返回短字符串中的
                return sChars.length > tChars.length ? sChars[i] : tChars[i];
            }
        }
        // 收尾处理，例如：s = "a", t = "aa"
        if (i < s.length()) {
            return sChars[s.length() - 1];
        }
        if (i < t.length()) {
            return tChars[t.length() - 1];
        }
        return ' ';
    }
}
/*
    解题思路：
        0.排序
        1.将两个字符串分别转换成字符数组，然后对两个字符数组进行排序
        2.重复字符就会相邻排列，那么比较相同索引位置的字符，如果不相等，则返回字符串长度长的那个字符串中对应索引位置的字符（因为长度长的字符串多出一个字符，必然是要返回的字符）
        3.最后需要进行收尾处理，因为可能有一个字符串的最后一个字符没有被比较到
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了59.01% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了26.05% 的用户
 */