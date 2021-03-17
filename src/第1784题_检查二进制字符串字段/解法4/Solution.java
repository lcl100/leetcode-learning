package 第1784题_检查二进制字符串字段.解法4;

public class Solution {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length - 1) {
            if (Integer.valueOf(chars[i] + "") - Integer.valueOf(chars[i + 1] + "") == -1) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        1.将字符"1"和"0"转换成数字来进行运算
        2.存在这么几种情况：[1,0]、[1,1]、[0,0]、[0,1]
        3.前三种情况都表示1是连续的，即前面的数减去后面的数的差为1,0,0，而[0,1]的差为-1，表示不连续
 */