package 面试题_02_02_返回倒数第k个节点.解法2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        // 1.计算链表中的结点个数
        ListNode tempHead = head;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        // 2.查找len-k位置的结点，该节点就是我们需要的
        int count = 0;
        while (tempHead != null) {
            if (count == len - k) {
                return tempHead.val;
            }
            count++;
            tempHead = tempHead.next;
        }
        return head.val;
    }
}
/*
    解题思路：
        0.循环两次
        1.先统计链表中的元素个数，才能计算要查找的节点的位置
        2.顺序查找结点，判断当前记录节点个数是否等于指定节点的位置，如果相等则返回
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了49.53% 的用户
 */