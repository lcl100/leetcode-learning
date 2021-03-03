package 第203题_移除链表元素.解法3;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        head.next=removeElements(head.next,val);
        return head.val==val ? head.next : head;
    }

    public void print(ListNode head){
        ListNode ln1=head.next;
        while (ln1 != null) {
            System.out.print(ln1.val + "\t");
            ln1 = ln1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode ln0 = new ListNode(-1);
        ListNode ln1 = new ListNode(6);
        ListNode ln2 = new ListNode(6);
        ListNode ln3 = new ListNode(6);
        ListNode ln4 = new ListNode(6);
        ListNode ln5 = new ListNode(4);
        ListNode ln6 = new ListNode(5);
        ListNode ln7 = new ListNode(6);
        ln0.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;
        ln7.next = null;
        ListNode listNode = new Solution().removeElements(ln0, 6);
        new Solution().print(listNode);

    }
}
/**
 * 思路：
 * 递归
 */
