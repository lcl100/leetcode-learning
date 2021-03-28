package 剑指Offer第18题_删除链表的节点.解法1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        // pre表示前驱节点；tempHead表示临时head节点
        ListNode pre = null, tempHead = head;
        // 如果要删除的节点是第一个节点
        if (head.val == val) {
            // 那么返回第二个节点所表示的链表
            return head.next;
        }
        // 表示删除的不是第一个节点，那么作下面的处理
        while (tempHead != null) {
            // 判断是否是待被删除的节点
            if (tempHead.val == val) {
                // 将被删除节点的前驱节点指向被删除节点的后继节点
                pre.next = tempHead.next;
            }
            // pre保存前驱节点，因为要删除链表的某个节点，必须知道前驱节点
            pre = tempHead;
            // 开始while的下一次循环
            tempHead = tempHead.next;
        }
        // 返回删除节点后的链表
        return head;
    }
}
/*
    解题思路：
        0.单层for循环遍历判断
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.1 MB, 在所有 Java 提交中击败了10.97% 的用户
 */