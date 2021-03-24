package 第367题_有效的完全平方数.解法1;

class Solution {
    public boolean isPerfectSquare(int num) {
        // 注意，如果num不是一个完全平方数，那么Math.sqart(num)得到一个小数，小数点后可能有好几位数字
        // Math.sqrt(num) - (int) Math.sqrt(num)可以得到小数点后的几位数字
        // 如果是完全平方数，那么它们的差为0；
        // 如果不是完全平方数，那么它们的差不为0，为一位小于1的小数
        return Math.sqrt(num) - (int) Math.sqrt(num) == 0;
    }

}
/*
    解题思路：
        0.API的sqrt()方法
        1.毕竟不是进阶版本，所以先用下看下效率怎么样
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了11.56% 的用户
 */