package 第191题_位1的个数.解法3;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;// 计数器，统计1出现的次数
        while (n != 0) {
            // 0101011
            // &
            // 0000001
            count += n & 1;
            n >>>= 1;// 注意：要用>>>而不是>>，否则发生死循环，因为n可能是负数
        }
        return count;
    }
}
/*
    解题思路：
        0.逐位运算
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了95.76% 的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了8.96% 的用户
 */