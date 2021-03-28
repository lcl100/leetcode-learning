package 第1662题_检查两个字符串数组是否相等.解法4;

import java.util.Stack;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Stack<Character> stack1 = pushArray(word1);
        Stack<Character> stack2 = pushArray(word2);
        // 如果两个栈中的字符个数不同，则返回false
        if (stack1.size() != stack2.size()) {
            return false;
        }
        // 出栈字符比较
        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        return true;
    }

    // 将字符串数组中的所有字符串的所有字符入栈
    private Stack<Character> pushArray(String[] word) {
        Stack<Character> stack = new Stack<>();
        for (String s : word) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                stack.push(aChar);
            }
        }
        return stack;
    }
}
/*
    解题思路：
        0.栈
        1.将字符串数组中的所有字符串的所有字符入栈
        2.然后比较出栈的字符是否相等
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了8.44% 的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了5.02% 的用户
 */