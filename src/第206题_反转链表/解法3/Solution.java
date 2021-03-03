package 第206题_反转链表.解法3;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode reverseList(ListNode head) {
        if(head==null){// 处理空链表[]的特殊情况
            return head;
        }
        ListNode top=new ListNode(head.val);// 初始时将单链表的首结点入栈
        while (head.next!=null){
            // 设置入栈结点的数据域和指针域
            ListNode newNode=new ListNode(head.next.val);
            newNode.next=top;
            // 修改栈顶指针
            top=newNode;
            // 循环遍历单链表的下一个结点
            head.next=head.next.next;
        }
        return top;
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
 * 将结点入栈，然后出栈就是反转的单链表
 */
