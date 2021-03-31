package 面试题_02_02_返回倒数第k个节点.解法1;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() - k).val;
    }
}
/*
    解题思路：
        1.将链表中所有节点放到List集合中
        2.通过对集合索引的访问得到所需要的节点
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了15.27% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了93.76% 的用户
 */