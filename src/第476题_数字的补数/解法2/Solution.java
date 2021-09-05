package 第476题_数字的补数.解法2;

import java.util.Stack;

public class Solution {
    public int findComplement(int num) {
        // 0.创建一个栈
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 2 == 1 ? 0 : 1);
            num /= 2;
        }
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            num += Math.pow(2, i) * stack.pop();
            i--;
        }
        return num;
    }
}
/*
7%2=1 7/2=3
3%2=1 3/2=1
1%2=1 1/2=0
 */
/*
10%2=0 10/2=5
5%2=1  5/2=2
2%2=0  2/2=1
1%2=1  1/2=0
 */
/*
14%2=0  14/2=7
7%2=1   7/2=3
3%2=1   3/2=1
1%2=1   1/2=0
(14)10=(1110)2=(0001)2补
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了21.51% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了80.54% 的用户
 */