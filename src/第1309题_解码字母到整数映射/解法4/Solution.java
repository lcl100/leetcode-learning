package 第1309题_解码字母到整数映射.解法4;

public class Solution {
    public String freqAlphabets(String s) {
        int cur, len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                cur = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                i -= 2;
            } else {
                cur = s.charAt(i) - '0';
            }
            sb.append((char) (cur - 1 + 'a'));
        }
        return sb.reverse().toString();
    }
}
/*
    解题思路：
        0.倒序遍历
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了48.38% 的用户
 */