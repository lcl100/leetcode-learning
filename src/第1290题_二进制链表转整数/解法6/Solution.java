package 第1290题_二进制链表转整数.解法6;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            // 等价于res = res * 2 + head.val;
            // 因为左移就相当于乘以2
            res = (res << 1) + head.val;
            head = head.next;
        }
        return res;
    }
}
/*
    解题思路：
        0.位运算
        1.解题思路和解法5一样
 */
