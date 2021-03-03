package 第876题_链表的中间结点.解法3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode middleNode(ListNode head) {
        // ListNode first = head.next;// 首结点
        // 特别注意：该题在leetcode中是没有头结点的，即head就是首结点，所以要改用下面这行代码
        ListNode first = head;

        // 1.设置两个指针：快指针fast和慢指针slow
        // 快指针走两步：fast=fast->next->next;
        // 慢指针走一步：slow=slow->next;
        // 初始时快、慢指针都为首结点
        ListNode fast = first;
        ListNode slow = first;

        // 2.两个指针进行走动
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode ln0 = new ListNode(-1);
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ln0.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = null;
        new Solution().middleNode(ln0);
    }
}
/**
 * 思路：
 * 设置快慢两个指针，快指针fast走两步，慢指针slow走一步，当fast走到链表尾时，slow刚好到链表的中间。
 * 需要注意的是while中的条件，同时契合奇数个结点和偶数个结点。
 */