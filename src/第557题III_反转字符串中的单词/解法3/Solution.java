package 第557题III_反转字符串中的单词.解法3;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        // 用栈来放每个单词中的所有字符
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 将所有非空格字符（即一个完整的单词）添加到栈中
            if (chars[i] != ' ') {
                stack.push(chars[i]);
            }
            if (chars[i] == ' ' || i == chars.length - 1) {
                // 倒序出栈栈顶字符
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                // 添加空格，最后一个字符后不用添加空格
                if (i != chars.length - 1) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.栈
 */
/*
    执行用时：45 ms, 在所有 Java 提交中击败了5.75% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了17.61% 的用户
 */


