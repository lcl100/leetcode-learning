package 第234题_回文链表.解法2;


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

        // 1.获取单链表的中间结点，注意单链表的个数，奇数个数元素的单链表和偶数个数元素的单链表
        // 1.1 统计单链表结点个数
        ListNode temp1=head;// 这种代码，都是为了操作head结点，但又不直接操作head结点对象，而是间接使用
        int length=0;
        while (temp1!=null){
            length++;
            temp1=temp1.next;
        }
        // 1.2 得到中间结点
        ListNode temp2=head;
        ListNode mid=null;
        int count=0;
        while (temp2!=null){
            count++;
            if(count==length/2+1){
                mid=temp2;
            }
            temp2=temp2.next;
        }
        // 1.3 特殊处理，其实为了反转后半个单链表，需要传入的是中间结点的后继结点
        // 偶数个数元素的单链表的中间结点没有问题，但奇数个数元素的单链表的中间结点就是最中间那个，但我们需要它的后继结点
        if(length%2!=0){
            mid=mid.next;
        }

        // 2.调用自定义的函数reverse()，反转后半个单链表
        ListNode reverse = reverse(mid);

        // 3.对比两个链表的每个结点的元素是否相同，如果不同则返回false
        ListNode temp3=head;
        while (reverse!=null&&temp3!=null){
            if(reverse.val!=temp3.val){
                return false;
            }
            temp3=temp3.next;
            reverse=reverse.next;
        }

        return true;
    }

    /**
     * 反转单链表
     * @param head 单链表的首结点，不是头结点
     * @return 返回反转完成的单链表
     */
    public ListNode reverse(ListNode head){
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
        ListNode head = solution.createTest(new int[]{1, 2, 3, 2,1 });
        solution.print(head);
        System.out.println(solution.isPalindrome(head));
    }
}
/**
 * 思路：
 * 反转后半个单链表，然后依次比较两个链表的每个结点的值
 */
