package 第58题_最后一个单词的长度.解法1;

class Solution {
    public int lengthOfLastWord(String s) {
        // 处理特殊情况，空字符串
        String trim = s.trim();// 得到去除空格后的字符串，因为字符串中存在着多个空格
        if (trim.length() == 0) {
            return 0;
        }
        // 将字符串按空格字符串" "分割成一个字符串数组
        String[] split = s.split(" ");
        // 然后返回字符串数组中最后一个数组的长度
        return split[split.length - 1].length();
    }
}
/*
    解题思路：
        0.String的API
        1.将字符串按照空格分割成一个字符串数组，然后返回字符串数组中最后一个字符串的长度
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了38.51% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了37.25% 的用户
 */