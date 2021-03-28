package 第58题_最后一个单词的长度.解法3;

public class Solution {
    public int lengthOfLastWord(String s) {
        // 去除字符串s首尾的空格
        String trimStr = s.trim();
        // 处理全是空格的字符串
        if (trimStr.length() == 0) {
            return 0;
        }
        // 去除首尾空格的字符串的最后一个字符的索引
        int i = trimStr.length() - 1;
        // 循环遍历
        while (i >= 0) {
            // 得到指定索引的字符
            char c = trimStr.charAt(i);
            // 找到倒数第一个空格字符的索引
            if (c == ' ') {
                // 然后返回长度
                return trimStr.length() - i - 1;
            }
            i--;
        }
        // 处理去除首尾空格后，只存在一个字符串的情况
        return trimStr.length();
    }
}
/*
    解题思路：
        0.单指针计数
        1.将字符串去除首尾空格后，然后倒数第一个空格之后的所有非空字符都是需要统计的字符个数
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.8 MB, 在所有 Java 提交中击败了45.32% 的用户
 */