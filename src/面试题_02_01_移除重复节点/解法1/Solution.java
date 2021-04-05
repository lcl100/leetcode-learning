package 面试题_02_01_移除重复节点.解法1;

import java.util.LinkedHashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        // 1.将链表中所有节点的val值装入Set中，达到去重的目的
        Set<Integer> set = new LinkedHashSet<>();
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        // 2.然后将set中节点重新连接成新链表返回
        ListNode temp = null;// 链表的头结点
        for (Integer val : set) {
            ListNode newNode = new ListNode(val);
            if (head == null) {// 处理空链表的情况
                head = newNode;// 空链表的情况下，该节点就为链表的第一个节点
                temp = head;// 保存链表的头结点
            } else {// 处理链表至少一个节点的情况
                head.next = newNode;
                head = head.next;
            }
        }
        return temp;
    }
}
/*
    解题思路：
        1.将链表中所有节点的val值装入Set中，达到去重的目的
        2.然后将set中节点重新连接成新链表返回
 */
/*
    执行用时：13 ms, 在所有 Java 提交中击败了20.42% 的用户
    内存消耗：41.3 MB, 在所有 Java 提交中击败了5.04% 的用户
 */
