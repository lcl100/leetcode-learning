package 第206题_反转链表.解法4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode reverseList(ListNode head) {
        // 单独处理空表[]的情况
        if(head==null){
            return head;
        }

        // 1.使用一个集合来存放所有的结点
        List<ListNode> list=new ArrayList<>();
        while (head!=null){
            list.add(head);
            head=head.next;
        }

        // 2.调用API实现元素反转
        Collections.reverse(list);

        // 3.重新将集合中的元素填充到链表中
        ListNode reverse=list.get(0);// 创建一个反转后的单链表
        ListNode reverseHead=reverse;// 保存头结点，使用的是尾插法
        for (int i = 1; i < list.size(); i++) {// 循环遍历将集合中的元素插入到单链表中
            reverse.next=list.get(i);
            reverse=reverse.next;
        }
        reverse.next=null;// 必须要有，否则陷入死循环

        return reverseHead;
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
 * 1.使用一个集合来存放所有的结点
 * 2.调用API实现元素反转
 * 3.重新将集合中的元素填充到链表中
 */
