package 第367题_有效的完全平方数.解法5;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
/*
    解题思路：
        0.数学，牛顿迭代法
    注:
        1.代码和解题思路来源于官方题解：https://leetcode-cn.com/problems/valid-perfect-square/solution/you-xiao-de-wan-quan-ping-fang-shu-by-leetcode/
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.2 MB, 在所有 Java 提交中击败了48.90% 的用户
 */