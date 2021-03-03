package 第234题_回文链表.解法3;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class StopMsgException extends RuntimeException {
}

public class Solution {
    ListNode temp;
    boolean flag=true;

    public boolean isPalindrome(ListNode head) {
        temp=head;// 将head赋予temp，因为会在下面函数中用到head对象，但不能直接操作head，因此间接使用
        reversePrint(head);// 调用函数，设置flag标志位
        return flag;// 返回结果
    }

    public void reversePrint(ListNode head){
        /* 使用递归反转链表 0 */
        if(head==null){
            return;
        }
        reversePrint(head.next);
        /* 使用递归反转链表 1 */

        // 判断是否是回文链表
        if(head.val==temp.val){// 判断两个结点的val值是否相等
            if(!flag){// 只要flag不为true就返回，退出遍历
                return;
            }
            flag=true;
        }else {
            flag=false;
        }
        temp=temp.next;
    }

    /**
     * 打印单链表
     * @param head 单链表的首结点
     */
    public void print(ListNode head){
        ListNode ln1=head;
        while (ln1 != null) {
            System.out.print(ln1.val + "\t");
            ln1 = ln1.next;
        }
        System.out.println();
    }

    /**
     * 根据数组创建用于测试的单链表
     * @param arr 整形数组
     * @return 返回单链表的首结点
     */
    public ListNode createTest(int[] arr){
        // 没有头结点
        ListNode listNode=new ListNode(arr[0]);
        ListNode temp=listNode;// 临时保存首结点
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode=new ListNode(arr[i]);
            newNode.next=null;
            listNode.next=newNode;
            listNode=listNode.next;
        }
        listNode.next=null;
        return temp;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode head = solution.createTest(new int[]{1, 1,2,1 });
        System.out.println(solution.isPalindrome(head));
    }
}
/**
 * 思路：
 * 递归
 */
