package 第206题_反转链表.解法2;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;// pre指针，初始为null
        ListNode first = head;// 快指针，初始为第一个结点
        while (first != null) {// 快指针first先前进，直到first==null为止
            // 创建一个新的结点，并赋予数据域和指针域
            ListNode newNode = new ListNode(first.val);
            newNode.next = pre;
            // 将新结点置为pre
            pre = newNode;
            first = first.next;// 开始下一次的循环
        }
        return pre;
    }

    public void print(ListNode head) {
        ListNode ln1 = head;
        while (ln1 != null) {
            System.out.print(ln1.val + "\t");
            ln1 = ln1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode ln0 = new ListNode(-1);
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(4);
        ListNode ln4 = new ListNode(5);
        ln0.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = null;

        new Solution().print(new Solution().reverseList(ln0.next));

    }
}
/**
 * 思路：
 * 利用双指针，一个pre和first指针，初始时pre为null，first指向首结点，
 * 每次让pre和first实现局部反转，然后同时向前移动一个位置，直到first到达单链表尾部
 * 其实本质上还是将结点重新插入到一个新的链表pre中，与解法1同出一辙，但思想是两个指针，一前一后
 * 而解法1是遍历循环单链表，然后重新插入。
 */
