package 第876题_链表的中间结点.解法1;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first = head.next;// 首结点
        // 特别注意：该题在leetcode中是没有头结点的，即head就是首结点，所以要改用下面这行代码
        // ListNode first=head;

        // 1.将数组所有结点保存到List集合中
        List<ListNode> list = new ArrayList<>();
        while (first != null) {
            list.add(first);
            first = first.next;
        }
        // 2.返回数组的中间元素结点
        return list.get(list.size() / 2);
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
 * 思路：将单链表的所有结点保存到一个数组中，无论是奇数个结点还是偶数个结点，都返回数组长度除2索引处的结点，即为所求。
 */