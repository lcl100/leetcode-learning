package 第917题_仅仅反转字符串.解法3;

import java.util.Stack;

public class Solution {
    public String reverseOnlyLetters(String S) {
        // 1.将字符串S中的所有字母入栈
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (isLetter(c)) {
                stack.push(c);
            }
        }
        // 2.出栈
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            // 如果是字符串，则出栈栈顶元素
            if (isLetter(c)) {
                sb.append(stack.pop());// 获取字母字符
            } else {
                sb.append(c);// 获取非字母字符
            }
        }
        // 3.返回连接好的字符串
        return sb.toString();
    }

    // 判断字符是否是字母
    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
/*
    解题思路：
        0.栈
        1.将字符串S中的所有字母入栈，这样出栈就是倒序操作字母了
        2.然后遍历字符串S中的所有字符，目的是获取到非字母字符，因为字母字符要出栈栈顶元素获取
        3.注意，出栈的字符和字符串S中的非字母字符要用字符串连接起来返回
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了27.21% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了44.81% 的用户
 */