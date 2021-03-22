package 第387题_字符串中的第一个唯一字符.解法1;

import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        // 使用Set去重，保存每个字符
        int i = 0;
        Set<Character> set = new LinkedHashSet<>();
        while (i < s.length()) {
            set.add(s.charAt(i));
            i++;
        }
        // 双层循环遍历
        for (Character character : set) {
            int count = 0;// 计数器，记录每个不重复字符的出现次数
            i = 0;// 二次利用i变量，记录在字符串s中当前是第几个字符
            int index = -1;// 局部变量，记录唯一字符的索引
            while (i < s.length()) {
                if (character == s.charAt(i)) {
                    count++;
                    index = i;
                }
                i++;
            }
            if (count == 1) {
                return index;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.双层for循环，暴力破解，计数
 */
/*
    执行用时：96 ms, 在所有 Java 提交中击败了5.20% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了73.08% 的用户
 */