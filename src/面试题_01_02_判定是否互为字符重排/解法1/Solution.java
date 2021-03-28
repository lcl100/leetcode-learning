package 面试题_01_02_判定是否互为字符重排.解法1;

import java.util.Arrays;

class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        // 将字符串转换成字符数组
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        // 对字符数组进行排序
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        // 再将字符数组转换成字符串，比较是否相等
        return new String(s1Chars).equals(new String(s2Chars));
    }
}
/*
    解题思路：
        0.API
        1.将字符串转换成字符数组，然后排序，再转换成字符串，比较两个字符串是否相等即可
    总结：
        1.效率还是不错
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了94.90% 的用户
 */
