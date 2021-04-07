package 第242题_有效的字母异位词.解法2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 字符串长度不相等则一定不等
        if (s.length() != t.length()) {
            return false;
        }
        // 用HashMap统计s和t字符串中每个字符的出现次数
        Map<Character, Integer> sMap = getMap(s);
        Map<Character, Integer> tMap = getMap(t);
        // 然后比较字符出现次数是否相等
        for (Character key : sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.get(key))) {
                return false;
            }
        }
        return true;
    }

    // 统计指定字符串str中各字符的出现次数，并以Map的形式返回
    private Map<Character, Integer> getMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        return map;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.使用HashMap统计每个字符串中每个字符的出现次数
        2.如果两个字符串中相同字符的出现次数都相同，那么表示两个字符串一定能够通过某种交换变成完全相等的两个字符串
 */
/*
    执行用时：15 ms, 在所有 Java 提交中击败了27.21% 的用户
    内存消耗：39.6 MB, 在所有 Java 提交中击败了5.06% 的用户
 */
