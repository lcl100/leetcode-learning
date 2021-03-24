package 第231题_2的幂.解法2;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 如果是负数，则直接返回false，因为如果是负数转换成二进制字符串后，第一位就是1
        if (n < 0) {
            return false;
        }
        // 将数转换成二进制字符串
        String s = Integer.toBinaryString(n);
        // 然后统计'1'字符的出现次数
        int oneCount = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
            i++;
        }
        return oneCount == 1;
    }
}
/*
    解题思路：
        0.字符串字符计数
        1.将数转换成二进制字符串
        2.然后统计字符串中'1'字符的出现次数
        3.只有'1'字符的出现次数为1才表示该数是2的幂次方
        4.注意，负数必须事先排除
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了7.93% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了8.82% 的用户
 */