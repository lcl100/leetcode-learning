package 第1290题_二进制链表转整数.解法2;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        // 将链表所有结点的值入栈
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        // 101 = 1*2^2+0*2^1+1*2^0
        // 计算十进制数
        int i = 0;// 计数器，记录当前是第几位二进制数，初始从0开始
        int val = 0;// 最终的十进制数
        while (!stack.isEmpty()) {
            val += stack.pop() * Math.pow(2, i);
            i++;
        }
        return val;
    }
}
/*
    解题思路：
        0.栈
        1.将链表中所有元素装入栈中
        2.然后获取栈顶元素计算二进制字符串转换成十进制数，并返回
            例如：101 = 1*2^2 + 0*2^1 + 1*2^0
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了16.19% 的用户
    内存消耗：35.5 MB, 在所有 Java 提交中击败了98.60% 的用户
 */
