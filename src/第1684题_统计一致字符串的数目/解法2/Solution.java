package 第1684题_统计一致字符串的数目.解法2;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // 用Set存储allowed字符串中的所有字符
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        // 判断一致字符串的个数
        int wordCount = 0;
        for (String word : words) {
            boolean flag = true;// 标记，判断word字符串是否是一致字符串
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    flag = false;// 如果某字符不包含在set中，表示当前字符串不是一致字符串，那么将标记flag置为false
                    break;
                }
            }
            if (flag) {// 如果flag为真表示当前字符串是一致字符串，则计数器加1
                wordCount++;
            }
        }
        return wordCount;
    }
}
/*
    解题思路：
        0.Set集合
        1.解题思路和解法1一致，都是判断字符出现
 */
/*
    执行用时：14 ms, 在所有 Java 提交中击败了61.52% 的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了48.61% 的用户
 */