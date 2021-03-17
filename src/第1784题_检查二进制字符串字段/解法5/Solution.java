package 第1784题_检查二进制字符串字段.解法5;

public class Solution {
    public boolean checkOnesSegment(String s) {
        // 将字符串s转换成字符数组
        char[] chars = s.toCharArray();
        // 计数器，记录'0'字符的出现个数
        int zeroCount = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                if (zeroCount > 0) {
                    return false;
                }
            } else {
                zeroCount++;
            }
        }
        return true;
    }
}
/*
    解题思路：
        1.将字符串s转换成字符数组chars
        2.统计字符'0'的出现个数
        3.由于chars[0]必定为1，所以最开始如果是连续的，那么字符'0'的个数必定为0
        4.所以在每次判断字符是否是'1'之前，先判断字符'0'的个数，如果"0"的个数大于了0，表示在字符串s中已经出现了'0'字符，那么执行到了该条判断，又表示又出现了'1'字符，但这些'1'字符不是连续的，直接返回false
 */