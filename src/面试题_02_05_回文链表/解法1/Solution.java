package 面试题_02_05_回文链表.解法1;

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
    public boolean isPalindrome(ListNode head) {
        // 由于不能确定长度，所以使用集合来存放，也可以使用数组，不过要多循环一次
        List<ListNode> list = new ArrayList<>();
        // 循环链表，将每个节点放到List集合中
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        // 循环List集合判断对称位置的元素是否相等
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i).val != list.get(list.size() - 1 - i).val) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.数组
        1.将所有节点放到数组中，然后从首位置和尾位置判断数组中对称位置的元素是否相等，如果相等则是回文链表
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了37.08% 的用户
    内存消耗：42 MB, 在所有 Java 提交中击败了44.79% 的用户
 */