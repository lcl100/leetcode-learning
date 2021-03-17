package 第1784题_检查二进制字符串字段.解法3;

public class Solution {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '0' && chars[i + 1] == '1') {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        1.将字符串转换成一个字符数组
        2.判断相邻的两个字符是否是"0"和"1"的情况，如果存在"01"表示从首字符开始的"1"不连续了
 */