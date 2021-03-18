package 剑指Offer第22题_链表中倒数第k个节点.解法3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    // 记录当前倒序是第几个节点
    int size = 0;

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode node = getKthFromEnd(head.next, k);
        size++;
        if (size == k) {
            return head;
        }
        return node;
    }
}
/*
    解题思路：
        0.递归
        1.代码参考自别人：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/solution/shuang-zhi-zhen-zhan-di-gui-3chong-jie-jue-fang-sh/
 */