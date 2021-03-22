package 第191题_位1的个数.解法1;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int oneCount = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }
}
/*
    解题思路：
        0.计数
        1.将数n转换成一个二进制字符串形式，统计字符串中'1'字符出现次数
    总结：
        1.核心思路就是计数，所以效率不高
        2.除了上面的方式计数外，还可以使用HashMap等统计'1'字符的出现次数
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了6.45% 的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了34.17% 的用户
 */