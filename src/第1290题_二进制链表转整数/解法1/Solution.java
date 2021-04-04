package 第1290题_二进制链表转整数.解法1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        // 利用StringBuilder读取链表中的二进制，转换成字符串
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        // 然后再利用Integer.parseInt()方法将二进制字符串转换成十进制返回
        return Integer.parseInt(sb.toString(), 2);
    }
}
/*
    解题思路：
        1.利用StringBuilder读取链表中的二进制，转换成字符串
        2.然后再利用Integer.parseInt()方法将二进制字符串转换成十进制返回
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了61.75% 的用户
 */
