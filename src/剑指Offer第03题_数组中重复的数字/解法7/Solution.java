package 剑指Offer第03题_数组中重复的数字.解法7;

import java.util.ArrayDeque;
import java.util.Arrays;

class Solution {
    public int findRepeatNumber(int[] nums) {
        // 将数组排序
        Arrays.sort(nums);
        // 创建一个队列
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // 循环遍历数组
        for (int num : nums) {
            // 判断是否队空
            if (queue.isEmpty()) {
                // 如果队列为空，则将元素入队
                queue.push(num);
            } else {
                // 如果不空，则将当前遍历的元素与队头元素比较
                if (queue.peekFirst() == num) {
                    // 如果相等，表示重复元素则返回
                    return num;
                } else {
                    // 不相等，则将队头元素出队
                    queue.pop();
                    // 并将当前遍历的元素入队
                    queue.push(num);
                }
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.队列
        1.思路和前面栈的解法有异曲同工之妙，栈是比较栈顶元素（由于先进后出的特性），队列是比较队头元素（由于先进先出的特性）
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了10.10% 的用户
    内存消耗：46 MB, 在所有 Java 提交中击败了85.98% 的用户
 */