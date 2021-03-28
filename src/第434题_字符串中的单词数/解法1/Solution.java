package 第434题_字符串中的单词数.解法1;

class Solution {
    public int countSegments(String s) {
        // "\\s+"是一个正则表达式，表示匹配1个或多个空格
        // trim()方法是去除字符串中的首尾空格，也需要处理只有空格的字符串
        return s.trim().length() == 0 ? 0 : s.trim().split("\\s+").length;
    }
}
/*
    解题思路：
        0.String的API
    注意事项：
        1.", , , ,        a, eaefa"中一个逗号也表示一个字符串
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了28.57% 的用户
    内存消耗：36.4 MB, 在所有 Java 提交中击败了35.20% 的用户
 */