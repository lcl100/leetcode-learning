package 剑指Offer第22题_链表中倒数第k个节点.解法1;

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
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() - k);
    }
}
/*
    解题思路：
        1.将链表中所有节点放到List集合中
        2.通过对集合索引的访问得到所需要的节点
 */