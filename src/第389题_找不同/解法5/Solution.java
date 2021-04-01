package 第389题_找不同.解法5;

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        // 合并字符串
        String str = s.concat(t);
        // 转换成字符数组
        char[] chars = str.toCharArray();
        // 对字符数组进行排序
        Arrays.sort(chars);
        // 循环遍历
        for (int i = 0; i < chars.length - 1; i += 2) {
            // 仅比较相邻字符
            if (chars[i] != chars[i + 1]) {
                // 返回相邻字符的第一个字符
                return chars[i];
            }
        }
        // 如果前面的循环没有匹配到，即所有相邻字符都相等，那么返回合并字符串的最后一个字符
        return chars[chars.length - 1];
    }
}
/*
    解题思路：
        0.排序
        1.将两个字符串合并成新字符串
        2.将合并后的字符串转换成字符数组，并排序，如果存在多个重复字符，那么它们就会相邻
        3.比较字符数组中的相邻字符，如果不相等，则返回相邻字符的第一个字符
        4.可能存在前面的所有相邻字符都相等，但字符总个数是奇数的，所以应该返回最后剩下的一个字符
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了59.01% 的用户
    内存消耗：37.1 MB, 在所有 Java 提交中击败了15.91% 的用户
 */