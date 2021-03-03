package 第206题_反转链表.解法1;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode reverse=null;// 表示反转后的单链表
        while (head!=null){
            ListNode temp=head.next;// 临时保存当前结点的后继结点
            /* 进行反转 0 */
            ListNode newNode=new ListNode(head.val);
            newNode.next=reverse;
            reverse=newNode;
            /* 下面两行代码更简洁，可以代替上面的三行代码，但是上面的代码可能更加容易理解 */
//            head.next=reverse;// head表示当前结点，即要进行头插入的新结点，值已经有了，只需要把next指向原reverse链表
//            reverse=head; // 然后将反转链表的首结点指向新插入的结点
            /* 进行反转 1 */
            head=temp;// 准备下一次循环
        }
        return reverse;
    }

    public void print(ListNode head){
        ListNode ln1=head;
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
 * 利用头插法实现单链表的反转
 */
