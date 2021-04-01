package 第389题_找不同.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public char findTheDifference(String s, String t) {
        // 连接两个字符串
        String str = s.concat(t);
        // 使用HashMap存储合并后字符串中每个字符的出现次数
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // 找到出现次数为奇数次的字符
        for (Character key : map.keySet()) {
            // 因为如果是s = "ae", t = "aea"这样的情况，'a'字符出现了三次，所以不应该判断是否等于1
            if (map.get(key) % 2 == 1) {
                return key;
            }
        }
        return ' ';
    }
}
/*
    解题思路：
        0.HashMap计数
        1.用HashMap统计合并后字符串中每个字符的出现次数
        2.返回出现次数是奇数次的字符
 */
/*
    执行用时：13 ms, 在所有 Java 提交中击败了11.55% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了5.30% 的用户
 */