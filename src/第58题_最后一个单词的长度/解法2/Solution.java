package 第58题_最后一个单词的长度.解法2;

public class Solution {
    public int lengthOfLastWord(String s) {
        /*String trimStr = s.trim();
        if (trimStr.length() == 0) {// 处理全失空格的字符串
            return 0;
        } else {
            if (trimStr.indexOf(' ') == -1) {// 处理只存在一个非空字符的字符串
                return trimStr.length();
            } else {// 处理存在多个非空字符的字符串
                return trimStr.length() - 1 - trimStr.lastIndexOf(' ');
            }
        }*/
        /* ---------------简化成一行代码------------------- */
        return s.trim().length() == 0 ? 0 : s.trim().indexOf(' ') == -1 ? s.trim().length() : s.trim().length() - 1 - s.trim().lastIndexOf(' ');
    }
}
/*
    解题思路：
        0.String的API
        1.更加高效的API
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了43.38% 的用户
 */