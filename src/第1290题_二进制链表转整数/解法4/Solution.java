package 第1290题_二进制链表转整数.解法4;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    private int i = 0;// 指针，记录二进制数是第几位，从0开始
    private int val = 0;// 最终转换成的十进制数

    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        val += getDecimalValue(head.next) + Math.pow(2, i) * head.val;
        i++;
        return val;
    }
}
/*
    解题思路：
        1.思路来源于倒序打印链表，但关于十进制数的计算和解法2一致
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了32.93% 的用户
 */
