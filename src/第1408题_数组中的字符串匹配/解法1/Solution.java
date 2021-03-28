package 第1408题_数组中的字符串匹配.解法1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();// 注意，要去重，题目中有相关测试用例
        for (String word : words) {
            for (String word1 : words) {
                if (!word.equals(word1) && word.contains(word1)) {
                    set.add(word1);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
/*
    解题思路：
        0.双层for循环，暴力破解
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了17.98% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了83.01% 的用户
 */