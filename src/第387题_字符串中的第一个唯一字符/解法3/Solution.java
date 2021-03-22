package 第387题_字符串中的第一个唯一字符.解法3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        // 将字符串s中每个字符的出现次数保存在Map中
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            i++;
        }
        i = 0;// 二次使用，重置为起始索引0
        while (i < s.length()) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.效率相对高些，不使用LinkedHashMap，不需要保持输入顺序
 */
/*
    执行用时：35 ms, 在所有 Java 提交中击败了27.63% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了38.03% 的用户
 */