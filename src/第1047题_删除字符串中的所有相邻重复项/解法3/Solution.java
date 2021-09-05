package 第1047题_删除字符串中的所有相邻重复项.解法3;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (char c : chars) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
/*
    执行用时：31 ms, 在所有 Java 提交中击败了35.01% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了51.42% 的用户
 */