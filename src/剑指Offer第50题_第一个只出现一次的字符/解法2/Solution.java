package 剑指Offer第50题_第一个只出现一次的字符.解法2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public char firstUniqChar(String s) {
        // 将字符串转换成字符数组，并用Map统计每个字符的出现次数
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();// 要用LinkedHashMap而不是HashMap，必须保证有序
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer value = map.get(aChar);
                value++;
                map.put(aChar, value);
            } else {
                map.put(aChar, 1);
            }
        }
        // 判断每个字符的出现次数是否满足要求
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return ' ';// 输入空字符串，返回' '
    }
}
/*
    解题思路：
        0.HashMap统计次数
        1.将字符串转换成字符数组，并用LinkedHashMap顺序统计每个字符的出现次数
        2.最后返回第一次出现并且统计次数为1的字符
 */
/*
    执行用时：38 ms, 在所有 Java 提交中击败了14.95% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了5.09% 的用户
 */