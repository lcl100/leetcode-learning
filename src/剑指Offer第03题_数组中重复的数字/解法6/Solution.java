package 剑指Offer第03题_数组中重复的数字.解法6;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        // 将数组进行排序
        Arrays.sort(nums);
        // 创建一个栈
        Stack<Integer> stack = new Stack<>();
        // 循环数组元素
        for (int num : nums) {
            // 需要判断是否栈空
            if (stack.isEmpty()) {
                // 如果栈空，则将当前遍历的元素添加进去
                stack.push(num);
            } else {
                // 如果栈不空，则可以考虑比较元素
                if (stack.peek() == num) {
                    // 如果栈顶元素与当前遍历的元素相同，则表示重复了，那么返回即可
                    return num;
                } else {
                    // 如果不相等，则表示不重复，那么直接添加到栈中即可，继续必须下一个元素
                    stack.push(num);
                }
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.栈
        1.将数组排序，如果将数组元素与栈顶元素比较，相等则出栈进行相互抵消，那么表示它们是重复元素
 */
/*
    执行用时：11 ms, 在所有 Java 提交中击败了8.16% 的用户
    内存消耗：46.7 MB, 在所有 Java 提交中击败了44.48% 的用户
 */