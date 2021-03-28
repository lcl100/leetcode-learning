package 面试题_01_06_字符串压缩.解法2;

public class Solution {
    public String compressString(String S) {
        // 单独处理空字符串
        if (S.equals("")) {
            return "";
        }
        // 为每个不同的字符串子串添加空格进行分隔
        // 例如："abbccd"  ——  "a bb cc d"
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            sb.append(chars[i]);
            if (chars[i] != chars[i + 1]) {
                sb.append(" ");
            }
        }
        sb.append(chars[chars.length - 1]);
        // 然后将字符串按空格分割成字符串子串数组，并统计子串的长度
        String[] split = sb.toString().split(" ");
        StringBuilder sb2 = new StringBuilder();
        for (String s : split) {
            sb2.append(s.charAt(0)).append(s.trim().length());
        }
        return sb2.toString().length() >= S.length() ? S : sb2.toString();
    }
}
/*
    解题思路：
        1.将不同的字符串子串用空格进行分隔开
        2.然后将其按照空格转换成字符串子串数组
        3.统计每个子串的长度
 */
/*
    执行用时：16 ms, 在所有 Java 提交中击败了12.47% 的用户
    内存消耗：40.5 MB, 在所有 Java 提交中击败了5.11% 的用户
 */