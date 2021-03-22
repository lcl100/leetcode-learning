package 第191题_位1的个数.解法2;

import java.util.Arrays;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                return chars.length - i;
            }
        }
        return 0;
    }
}
/*
    解题思路：
        0.计数
        1.将n先转换成二进制字符串，然后将字符串转换成字符数组
        2.将字符数组排序，然后查找第一个字符为'1'的索引
        3.最后通过数组长度减去索引得到个数
    总结：
        1.本质上也是计数，而且操作繁琐，所以效率也不高
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了6.45% 的用户
    内存消耗：35.5 MB, 在所有 Java 提交中击败了19.85% 的用户
 */