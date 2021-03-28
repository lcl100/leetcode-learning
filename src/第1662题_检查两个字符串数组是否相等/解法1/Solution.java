package 第1662题_检查两个字符串数组是否相等.解法1;

import java.util.Arrays;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Arrays.toString(word1).replaceAll(", ", "")将字符串数组转换成字符串并且替换里面的逗号分隔符，然后比较字符串是否相等
        return Arrays.toString(word1).replaceAll(", ", "").equals(Arrays.toString(word2).replaceAll(", ", ""));
    }
}
/*
    解题思路：
        0.API
        1.将字符串数组转换成字符串然后比较是否相等
 */
/*
    执行用时：11 ms, 在所有 Java 提交中击败了8.44% 的用户
    内存消耗：38.1 MB, 在所有 Java 提交中击败了5.02% 的用户
 */
