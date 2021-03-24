package 第367题_有效的完全平方数.解法3;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        // right完全没必要从num开始，因为即使是(num/2)^2也大于num
        long left = 2, right = num / 2;
        long x, guessSquared;// 猜的数的平方
        while (left <= right) {
            x = left + (right - left) / 2;// 获取中间的数
            guessSquared = x * x;// 计算数的平方
            // 如果已经猜中，那么直接返回true
            if (guessSquared == num) {
                return true;
            }
            // 如果没有，则继续猜
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }
}
/*
    解题思路：
        0.思路和代码来源于官方题解：https://leetcode-cn.com/problems/valid-perfect-square/solution/you-xiao-de-wan-quan-ping-fang-shu-by-leetcode/
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.2 MB, 在所有 Java 提交中击败了64.55% 的用户
 */