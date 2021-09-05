package 第509题_斐波那契数.解法1;

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
/*
    解题思路：
        0.递归
 */
/*
    执行用时：9 ms, 在所有 Java 提交中击败了24.96% 的用户
    内存消耗：35.3 MB, 在所有 Java 提交中击败了26.74% 的用户
 */