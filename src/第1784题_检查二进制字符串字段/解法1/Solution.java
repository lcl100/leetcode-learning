package 第1784题_检查二进制字符串字段.解法1;

public class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
/*
    解题思路：
        1.即判断字符串中是否包含子串"01"，如果包含"01"子串就表示1不是连续的了
        参考自其他题解：https://leetcode-cn.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/solution/ji-ran-da-jia-du-yi-xing-dai-ma-na-javay-jpoc/
 */
