package 剑指Offer第50题_第一个只出现一次的字符.解法5;

public class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (s.indexOf(aChar) == s.lastIndexOf(aChar)) {
                return aChar;
            }
        }
        return ' ';
    }
}
/*
    解题思路：
        0.字符串的相关API
        1.将字符串转换成字符数组
        2.遍历数组中的每个字符，然后通过indexOf()方法查找该字符在字符串中第一次出现的索引位置，通过lastIndexOf()查找该字符在字符串中最后一次出现的索引位置
        3.如果该字符只出现过一次，那么索引就会相等，即为所查找的字符
 */
/*
    执行用时：30 ms, 在所有 Java 提交中击败了36.23% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了81.19% 的用户
 */