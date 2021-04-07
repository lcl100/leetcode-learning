package 第242题_有效的字母异位词.解法1;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // 转换成字符数组
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        // 对字符数组排序
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        // 再转换成字符串，比较是否相等
        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }
}
/*
    题目解析：
        1.所谓的字母异位词就是字符串s中一些字母不在原来的位置，相当于某些字符交换了位置
        2.所以本题需要转变思路来考虑，不去关心字母异位的问题，而是考虑去比较字符串s和t本质上是否相等（即t经过某些变化，能否将t字符串转换成s字符串）
    解题思路：
        0.排序
        1.将字符串s和t转换成字符数组sChars和tChars
        2.然后将sChars和tChars字符数组排序
        3.最后将两个字符数组转换成字符串，比较两个字符串是否相等
        4.本题的思路就是：如果两个字符串转换成字符数组排序后，再转换成字符串，如果两个字符串相等则表示是t是s的字母异位词，否则不是
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了99.98% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了55.31% 的用户
 */