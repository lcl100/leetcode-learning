package 第509题_斐波那契数.解法3;

public class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
/*
    解题思路：
        0.动态规划
        1.解法2的继续优化
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了59.04% 的用户
 */
