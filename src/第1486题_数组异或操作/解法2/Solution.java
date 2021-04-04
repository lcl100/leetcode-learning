package 第1486题_数组异或操作.解法2;

public class Solution {
    public int xorOperation(int n, int start) {
        int xor = start;// start就是nums数组中的第一个数
        for (int i = 1; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }
}
/*
    解题思路：
        0.解法1的优化
        1.直接异或计算
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了71.12% 的用户
 */