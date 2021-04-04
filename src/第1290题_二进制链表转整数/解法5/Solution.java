package 第1290题_二进制链表转整数.解法5;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }
}
/*
    解题思路：
        1.假如有一个十进制字符串"1234"，那么计算方法是
            4+3*10+2*100+1*1000=4+(3+2*10+1*100)*10=4+(3+(2+1*10)*10)*10=4+(3+(2+(1)*10)*10)*10=1234
        2.那么二进制字符串"101"的计算同样如此
            101=1*2^2+0*2^1+1*2^0=1*2^2+0*2^1+1=2*(1*2+0)+1=2*(2*(1)+0)+1=5
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了63.59% 的用户
 */