package 面试题_02_02_返回倒数第k个节点.解法3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    // 记录当前倒序是第几个节点
    int size = 0;

    public int kthToLast(ListNode head, int k) {
        if (head == null) {
            return -1;
        }
        int v = kthToLast(head.next, k);
        size++;
        if (size == k) {
            return head.val;
        }
        return v;
    }
}
/*
    解题思路：
        0.递归
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了58.16% 的用户
 */