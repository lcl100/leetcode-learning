package 第1221题_分割平衡字符串.解法1;

import java.util.Stack;

/**
 * @author lcl100
 * @create 2021-09-06 20:33
 */
class Solution {
    /**
     * <p>思路：栈。如果栈为空则入栈，如果栈不为空则与栈顶元素比较，如果相同则入栈，如果不同则将栈顶元素出栈，如果出栈后栈空则表示存在一个平衡子字符串。即用'L'抵消'R'。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：2 ms, 在所有 Java 提交中击败了9.18% 的用户</li>
     *     <li>内存消耗：36 MB, 在所有 Java 提交中击败了83.26% 的用户</li>
     *     <li>通过测试用例：40 / 40</li>
     * </ul>
     *
     * @param s 平衡字符串
     * @return 可以通过分割得到的平衡字符串的最大数量
     */
    public int balancedStringSplit(String s) {
        // 平衡子字符串的个数
        int count = 0;
        // 栈
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        // 循环遍历每个字符
        for (char aChar : chars) {
            // 如果栈为空则将字符入栈
            if (stack.isEmpty()) {
                stack.push(aChar);
            } else {
                // 如果栈不为空则将元素出栈比较
                char top = (char) stack.peek();// 获取栈顶元素
                // 如果栈顶元素与当前字符相同，则继续入栈
                if (top == aChar) {
                    stack.push(aChar);
                } else {
                    // 如果不相同则出栈
                    stack.pop();
                    // 如果栈空则表示完成了一个平衡子字符串的分割，则计数器加一
                    if (stack.isEmpty()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}