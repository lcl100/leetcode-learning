package 第203题_移除链表元素.解法1;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        // 注意：在leetcode中head就是首结点，即第一个结点，而不是所谓的头结点，给出的head很具有误导性
        // 1.删除连续首结点值等于val的情况
        while (head!=null&&head.val==val){
            // 所以首结点下一个结点就是新的首结点
            head=head.next;// 删除值相同的首结点，如[1,1,1,2]的情况
        }
        // 本段代码必须在上面的while之后，是为了应对[1,1,1]的情况
        if(head==null){
            return head;// 处理单链表为[]的情况
        }

        // 2.处理非首结点值等于val的情况
        // 处理[2,2,1,3,1]的情况
        ListNode preNode=head;// 保存的是前驱结点，初始值为首结点
        /**
         * 对于preNode.next!=null的说明：
         *  这里必须是preNode.next!=null，即preNode.next表示链表中的第二个结点，经过上面代码的处理后，第一个结点必然为值不等于val的结点。
         *  即即使preNode.next==null，那么preNode将是单链表中的唯一一个值不等于val的结点，将返回。
         *  所以循环要从第二个结点preNode.next开始，而不是从preNode!=null开始，而且preNode表示前驱结点，删除结点必须要知道前驱结点
         *  因此循环中判断值的当前节点就是preNode.next，即判断preNode.next.val==val
         */
        while (preNode.next!=null){
            if(preNode.next.val==val){// 删除值等于val的结点
                preNode.next=preNode.next.next;
            }else {// 将当前结点置为前驱结点
                preNode=preNode.next;
            }
        }
        return head;
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
        ListNode ln3 = new ListNode(6);
        ListNode ln4 = new ListNode(3);
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
        ListNode listNode = new Solution().removeElements(ln0.next, 6);
        new Solution().print(listNode);

    }
}
/**
 * 思路：
 * 单独处理连续首结点值等于val的情况，再处理非首结点值等于val的情况删除结点
 */
