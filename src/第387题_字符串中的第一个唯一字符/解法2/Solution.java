package 第387题_字符串中的第一个唯一字符.解法2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            i++;
        }
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            if (map.get(key) == 1) {
                return s.indexOf(key);
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap计数
 */
/*
    执行用时：39 ms, 在所有 Java 提交中击败了17.89% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了95.05% 的用户
 */