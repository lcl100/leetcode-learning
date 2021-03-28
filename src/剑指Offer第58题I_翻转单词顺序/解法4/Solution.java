package 剑指Offer第58题I_翻转单词顺序.解法4;

public class Solution {
    public String reverseWords(String s) {
        // 去除多余的空格
        s = s.trim().replaceAll("\\s+", " ");
        char[] chars = s.toCharArray();
        int i = 0, j = 0;
        StringBuilder str = new StringBuilder();
        while (j < chars.length) {
            while (j != chars.length && chars[j] != ' ') {
                j++;
            }
            // 直接将每个单词插在原字符串的前面，属于头插法
            str.insert(0, " " + s.substring(i, j));
            i = j + 1;
            j++;
        }
        return str.toString().trim();
    }
}
/*
    解题思路：
        1.将段落中每个单词插在重新组装字符串的前面
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了13.39% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了9.65% 的用户
 */