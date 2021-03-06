package 第844题_比较含退格的字符串.解法1;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        return backspaceStack(S).equals(backspaceStack(T));
    }

    public String backspaceStack(String Str) {
        // 1.将字符串Str入栈
        Stack<Character> stack = new Stack<>();
        char[] chars = Str.toCharArray();
        for (char aChar : chars) {
            if (aChar != '#') {
                stack.push(aChar);
            } else {
                // 如果该字符是'#'，那么将栈中的元素出栈一个
                if (!stack.empty()) {// 注意：在出栈前，需要判断栈是否为空
                    stack.pop();
                }
            }
        }
        // 2.将栈stack内的字符拼接成字符串返回
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.利用栈的特效：先进后出
        1.将字符串中的每个字符入栈，判断是否是'#'字符，如果是则将栈中元素出栈一个，如果不是则将该字符入栈
 */