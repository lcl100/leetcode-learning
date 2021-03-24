package 第326题_3的幂.解法2;

public class Solution {
    public boolean isPowerOfThree(int n) {
        // 处理0和负数
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        // 如果n是3的幂，那么最终n会变成1，也就是说如果不是1，那么就不是3的幂
        return n == 1;
    }
}
/*
    解题思路：
        0.作除法，效率比作乘法高
 */
/*
    执行用时：15 ms, 在所有 Java 提交中击败了99.23% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了31.07% 的用户
 */