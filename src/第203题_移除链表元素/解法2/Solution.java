package 第203题_移除链表元素.解法2;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        // 再次重申：leetcode中head表示首结点，不表示头结点

        // 创建一个虚拟头结点
        ListNode virtualHead=new ListNode(val-1);// 虚拟头结点的值只需要与val的值不同即可
        virtualHead.next=head;

        // 删除单链表中的结点
        ListNode first=virtualHead.next;// 该结点表示首结点，即链表的第一个结点，也是头结点的后继结点
        ListNode preNode=virtualHead;// 表示前驱结点，初始值为虚拟的头结点
        while (first!=null){
            if(first.val==val){
                preNode.next=first.next;
            }else {
                preNode=preNode.next;
            }
            first=first.next;
        }

        return virtualHead.next;
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
 * 创建一个虚拟结点，将虚拟结点的next指针指向首结点head，即不再单独处理第一个结点值等于val的情况
 */
