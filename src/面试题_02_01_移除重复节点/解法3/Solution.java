package 面试题_02_01_移除重复节点.解法3;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        ListNode pre = null;// 保存前驱节点，因为链表要删除一个节点必须知道前驱节点
        while (head != null) {
            if (map.containsKey(head.val)) {
                pre.next = head.next;
            } else {
                map.put(head.val, 1);
                pre = head;
            }
            head = head.next;
        }
        return temp;
    }
}
/*
    解题思路：
        1.HashMap去重，删除原链表的重复节点
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了57.02% 的用户
    内存消耗：39.6 MB, 在所有 Java 提交中击败了68.82% 的用户
 */