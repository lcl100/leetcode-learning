package 第231题_2的幂.解法3;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 如果是负数，则直接返回false，因为如果是负数转换成二进制字符串后，第一位就是1
        if (n <= 0) {
            return false;
        }
        // 将数转换成二进制字符串
        String s = Integer.toBinaryString(n);
        // 直接查找索引，如果只有一个'1'字符，那么索引必然相同
        return s.indexOf('1') == s.lastIndexOf('1');
    }
}
/*
    解题思路：
        0.解法2的变种
        1.感觉转换成字符串后，问题就变向了利用字符串的思路来求解，转换成字符串后效率变低，所以需要思考更多的其他方法
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了7.93% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了5.38% 的用户
 */
