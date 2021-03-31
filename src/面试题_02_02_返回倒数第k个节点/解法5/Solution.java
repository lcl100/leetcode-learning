package 面试题_02_02_返回倒数第k个节点.解法5;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        // 先让fast指针移动k步
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        // 然后让fast指针和slow指针同步移动，直到fast为null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}

/*
    解题思路：
        0.快慢双指针
        1.设置两根指针slow和fast，让fast指针先走k步，然后当fast为null时，slow指针所指向节点正为所求
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了71.62% 的用户
 */