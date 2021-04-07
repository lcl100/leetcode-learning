package 第242题_有效的字母异位词.解法5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 长度不相等则一定不等
        if (s.length() != t.length()) {
            return false;
        }
        // 用一个HashMap统计每个字符的出现次数
        Map<Character, Integer> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            map.put(sChars[i], map.getOrDefault(sChars[i], 0) + 1);
            map.put(tChars[i], map.getOrDefault(tChars[i], 0) - 1);
        }
        // 判断HashMap中每个字符的出现次数是否为0
        for (Character key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.单HashMap计数
        1.使用一个HashMap来统计每个字符的出现次数
 */
/*
    执行用时：26 ms, 在所有 Java 提交中击败了6.28% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了87.83% 的用户
 */