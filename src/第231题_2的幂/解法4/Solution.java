package 第231题_2的幂.解法4;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 单独处理0和负数
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        // 如果是2的幂，那么最后n会等于0，如果不是，那么会返回1
        return n == 1;
    }
}
/*
    解题思路：
        0.求n的二进制
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了7.89% 的用户
 */