package 剑指Offer第22题_链表中倒数第k个节点.解法4;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 1.将链表节点入栈
        Stack<ListNode> stack=new Stack<>();
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        // 2.出栈元素，记录个数
        int count=0;
        while (!stack.empty()){
            ListNode pop = stack.pop();
            count++;
            if(count==k){
                return pop;
            }
        }
        return head;
    }
}
/*
    解题思路：
        0.栈
        1.将链表节点先全部入栈
        2.然后出栈，记录已出栈元素个数，当出栈元素个数等于k的节点即为所求
 */