package 第1784题_检查二进制字符串字段.解法6;

public class Solution {
    public boolean checkOnesSegment(String s) {
        // 将字符串按'0'字符分割成只包含'1'字符的子串
        String[] split = s.split("0");
        // 计算分割后数组中非空串的个数（即只包含'1'字符的子串个数）
        int count = 0;
        for (String s1 : split) {
            if (!s1.equals("")) {
                count++;
            }
        }
        // 看最后子串的数目
        return count <= 1;
    }
}
/*
    解题思路：
        即将字符串s分割成只包含字符'1’的子串，然后统计子串的个数，只有小于等于1才是连续的，否则有多个出现
        参考自：https://leetcode-cn.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/solution/java-zhi-jie-zi-fu-chuan-fen-ge-by-hxz19-pib3/
 */