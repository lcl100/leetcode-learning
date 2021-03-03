package 第237题_删除链表中的节点.解法1;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public void deleteNode(ListNode node) {
        // 将要删除结点的值替换为该结点的下一个结点的值
        node.val=node.next.val;
        // 将要删除结点的next指针指向该结点的下一个结点的next指针
        node.next=node.next.next;
    }


    public static void main(String[] args) {
        ListNode ln0 = new ListNode(-1);
        ListNode ln1 = new ListNode(4);
        ListNode ln2 = new ListNode(5);
        ListNode ln3 = new ListNode(1);
        ListNode ln4 = new ListNode(9);
        ln0.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = null;
        new Solution().deleteNode(ln2);

        while (ln1!=null){
            System.out.print(ln1.val+"\t");
            ln1=ln1.next;
        }
    }
}
/**
 * 思路：
 * 在说思路之前，必须说明的是，这道题不同于一般删除链表的结点问题，一般情况下要传入链表和结点，但这里的参数只有结点，没有链表传入，需要注意。
 * 本题很巧妙，没有直接删除要删除的结点，而是间接删除的，实际上删除的是要被删除节点的下一个节点，看图。
 * 将node结点的值替换为node->next结点的值，将node结点的next指针替换为node->next->next（即下一个结点所指向的next指针），所以删除的是node->next结点
 */
