package 第876题_链表的中间结点.解法2;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode first = head.next;// 首结点
        // 特别注意：该题在leetcode中是没有头结点的，即head就是首结点，所以要改用下面这行代码
        // ListNode first=head;
        ListNode temp=head;// 注意，这行代码，是为了下面遍历循环单链表所临时保存的，因为第一次遍历完单链表后，first已经为null了，不能再次进行遍历

        // 1.统计单链表中结点的个数
        int length=0;// 计数器，记录单链表中的结点个数
        while (first!=null){
            length++;
            first=first.next;
        }

        // 2.查找到num=length/2+1的结点，并返回
        int num=0;// 也是一个计数器，记录当前结点的序号
        while (temp!=null){
            num++;
            if(num==length/2+1){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode ln0 = new ListNode(-1);
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ln0.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = null;
        new Solution().middleNode(ln0);
    }
}
/**
 * 思路：
 *  第一步：统计单链表的结点个数length
 *  第二步：找到单链表中序号为length/2的结点并返回
 */