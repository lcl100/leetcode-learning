package 第1290题_二进制链表转整数.解法3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        // 计算链表中二进制位的个数
        int n = 0;
        ListNode tempHead = head;
        while (tempHead != null) {
            n++;
            tempHead = tempHead.next;
        }
        // 计算转换后的十进制数
        int val = 0;// 记录转换后的十进制数
        while (head != null) {// 顺序遍历链表
            val += Math.pow(2, n - 1) * head.val;
            n--;// n指针减1
            head = head.next;
        }
        return val;
    }
}
/*
    解题思路：
        1.和解法2的思路基本一致，不过一个是顺序遍历，一个是倒序遍历
            例如：101 = 1*2^2 + 0*2^1 + 1*2^0
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了45.84% 的用户
 */