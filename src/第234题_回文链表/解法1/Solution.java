package 第234题_回文链表.解法1;


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

    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){// 处理[]和[1]的情况
            return true;
        }

        // head表示首结点，不是头结点
        List<ListNode> list=new ArrayList<>();
        while (head!=null){
            list.add(head);
            head=head.next;
        }


        boolean flag=false;// 一个标志，表示该链表是否是回文链表
        for(int i=0;i<list.size()/2;i++){
            if(list.get(i).val==list.get(list.size()-i-1).val){
                flag=true;
            }else {
                flag=false;
                break;// 只要有一次flag变成了false，那么就不是回文链表，直接跳出循环
            }
        }
        return flag;
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
        ListNode ln3 = new ListNode(1);
        ListNode ln4 = new ListNode(1);
        ln0.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = null;
        Boolean isP = new Solution().isPalindrome(ln0.next);
        System.out.println(isP);

    }
}
/**
 * 思路：
 * 将单链表的所有结点存放到数组中，然后循环比较对应索引的结点值是否相等
 */
