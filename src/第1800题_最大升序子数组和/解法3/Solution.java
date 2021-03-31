package 第1800题_最大升序子数组和.解法3;

import java.util.Stack;

public class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.push(nums[i]);
            } else {
                // 计算栈中所有元素的总和
                while (!stack.isEmpty()) {
                    sum += stack.pop();
                }
                stack.push(nums[i]);
                maxSum = Math.max(sum, maxSum);
                sum = 0;// 由于sum用来存储升序子数组的总和，所以需要下一次计算的时候需要清零
            }
        }
        // 处理栈中剩余的元素，由于遍历到数组的末尾，栈中的元素没有来得及处理，所以需要下面的代码收尾
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return Math.max(sum, maxSum);
    }
}
/*
    解题思路：
        0.栈
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了7.56% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了79.95% 的用户
 */