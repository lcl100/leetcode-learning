package 剑指Offer第05题_替换空格.解法3;

public class Solution {
    public String replaceSpace(String s) {
        char[] chars = new char[s.length() * 3];// 最坏的情况就是字符串种所有字符都是空格
        int i = 0;
        int size = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ' ') {
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            } else {
                chars[size++] = c;
            }
            i++;
        }
        return new String(chars, 0, size);
    }
}
/*
    解题思路：
        0.思路来源于官方题解：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/mian-shi-ti-05-ti-huan-kong-ge-by-leetcode-solutio/
        1.即逐个处理空格字符
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了84.08% 的用户
 */