package 第387题_字符串中的第一个唯一字符.解法4;

public class Solution {
    public int firstUniqChar(String s) {
        int i = 0;
        int len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
/*
    解题思路：
        0.String类的API
        1.从字符串的第一个字符和最后一个字符向中间查找，如果索引相等，则表示只有一个字符，如果有多个相等的字符，那么它们的索引一定会不等
 */
/*
    执行用时：30 ms, 在所有 Java 提交中击败了49.44% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了12.28% 的用户
 */