package 面试题_02_01_移除重复节点.解法2;

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
        ListNode temp = null, tempR=null;
        while (head != null) {
            if (!map.containsKey(head.val)) {
                map.put(head.val, 1);
                if (temp == null) {
                    temp = new ListNode(head.val);
                    tempR = temp;
                } else {
                    temp.next = new ListNode(head.val);
                    temp = temp.next;
                }
            }
            head = head.next;
        }
        return tempR;
    }
}
/*
    解题思路：
        1.利用HashMap去重，并且重新将不重复元素连接成新链表
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了37.33% 的用户
    内存消耗：41.4 MB, 在所有 Java 提交中击败了5.04% 的用户
 */