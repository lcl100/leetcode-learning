package 剑指Offer第39题_数组中出现次数超过一半的数字.解法4;

import java.util.Stack;

public class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            // 如果栈为空，或者栈顶元素等于当前正在遍历的元素则入栈
            if (stack.isEmpty() || stack.peek() == num) {
                stack.push(num);
            } else {
                // 如果栈顶元素不等于当前正在遍历的元素则出栈
                stack.pop();
            }
        }
        // 那么最后栈中剩下的元素一定是出现次数超过一半的数字
        return stack.pop();
    }
}
/*
    解题思路：
        0.栈
        1.本题的思路其实本质上和摩尔投票法一致，如果当前正在遍历的元素不等于栈顶元素则出栈，如果相等则入栈
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了27.78% 的用户
    内存消耗：44.2 MB, 在所有 Java 提交中击败了5.05% 的用户
 */