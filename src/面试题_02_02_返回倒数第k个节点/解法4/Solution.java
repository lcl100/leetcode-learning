package 面试题_02_02_返回倒数第k个节点.解法4;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        // 1.将链表节点入栈
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        // 2.出栈元素，记录个数
        int count = 0;
        while (!stack.empty()) {
            ListNode pop = stack.pop();
            count++;
            if (count == k) {
                return pop.val;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.栈
        1.将链表节点先全部入栈
        2.然后出栈，记录已出栈元素个数，当出栈元素个数等于k的节点即为所求
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了15.27% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了10.78% 的用户
 */