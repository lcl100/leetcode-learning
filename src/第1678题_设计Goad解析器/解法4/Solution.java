package 第1678题_设计Goad解析器.解法4;

import java.util.Stack;

public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = command.toCharArray();
        for (char c : chars) {
            if (c == 'G') {
                sb.append("G");
            } else if (c == '(') {
                stack.push('(');
            } else if (c == 'a') {
                stack.push('a');
            } else if (c == 'l') {
                stack.push('l');
            } else if (c == ')' && stack.peek() == '(') {// 处理"()"的情况
                stack.pop();
                sb.append("o");
            } else {// 处理"(al)"的情况
                stack.pop();
                stack.pop();
                stack.pop();
                sb.append("al");
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
    执行用时：1 ms, 在所有 Java 提交中击败了74.57% 的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了71.90% 的用户
 */