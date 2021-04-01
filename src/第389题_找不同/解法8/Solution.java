package 第389题_找不同.解法8;

public class Solution {
    public char findTheDifference(String s, String t) {
        for (char c : s.toCharArray()) {
            t = t.replaceFirst(c + "", "");
        }
        return t.charAt(0);
    }
}
/*
    解题思路：
        0.字符串的API
        1.用字符串s中的每个字符匹配字符串t中的字符，然后替换为""空字符串
        2.最后字符串t只剩下一个字符，就是我们需要的字符
 */
/*
    执行用时：43 ms, 在所有 Java 提交中击败了5.62% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了5.05% 的用户
 */
