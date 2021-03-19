package 面试题_02_05_回文链表.解法2;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        // 1.将所有节点入栈
        ListNode tempHead = head;
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        // 2.将节点出栈并与链表节点比较
        while (!stack.isEmpty() && tempHead != null) {
            // 获取出栈节点
            ListNode pop = stack.pop();
            // 进行比较
            if (pop.val != tempHead.val) {
                return false;
            }
            // 链表继续下一个节点
            tempHead = tempHead.next;
        }
        return true;
    }
}
/*
    解题思路：
        0.栈
        1.将所有节点存放到栈中
        2.然后将出栈节点与链表节点依次比较是否相等
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了37.08% 的用户
    内存消耗：42 MB, 在所有 Java 提交中击败了46.51% 的用户
 */