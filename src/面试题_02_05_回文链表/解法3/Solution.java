package 面试题_02_05_回文链表.解法3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    ListNode temp;
    boolean flag = true;

    public boolean isPalindrome(ListNode head) {
        temp = head;// 将head赋予temp，因为会在下面函数中用到head对象，但不能直接操作head，因此间接使用
        reversePrint(head);// 调用函数，设置flag标志位
        return flag;// 返回结果
    }

    public void reversePrint(ListNode head) {
        /* 使用递归反转链表 0 */
        if (head == null) {
            return;
        }
        reversePrint(head.next);
        /* 使用递归反转链表 1 */

        // 判断是否是回文链表
        if (head.val == temp.val) {// 判断两个结点的val值是否相等
            if (!flag) {// 只要flag不为true就返回，退出遍历
                return;
            }
            flag = true;
        } else {
            flag = false;
        }
        temp = temp.next;
    }
}
/*
    解题思路：
        0.递归
        1.将链表递归，将递归的结点与正序链表的结点比较
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了60.34% 的用户
    内存消耗：44.7 MB, 在所有 Java 提交中击败了7.89% 的用户
 */