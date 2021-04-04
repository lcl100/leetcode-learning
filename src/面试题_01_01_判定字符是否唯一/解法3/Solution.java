package 面试题_01_01_判定字符是否唯一.解法3;

import java.util.Arrays;

class Solution {
    public boolean isUnique(String astr) {
        if (astr == null) {
            return false;
        }
        char[] chars = astr.toCharArray();
        if (chars.length <= 1) {
            return true;
        }
        // 排序
        Arrays.sort(chars);
        // 循环比较相邻元素
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.排序
        1.对字符串转换成的字符数组排序，然后比较相邻元素是否相等
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了78.70% 的用户
 */