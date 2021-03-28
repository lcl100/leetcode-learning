package 第1189题_气球的最大数量.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfBalloons(String text) {
        // 考虑用HashMap来记录"balloon"中字符的出现次数，初始为0
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        // 统计text字符串中"balloon"字符的出现次数，并存储在HashMap中
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            i++;
        }
        // 统计"balloon"的数量
        int balloonCount = 0;
        int bCount = map.get('b');
        int aCount = map.get('a');
        int lCount = map.get('l');
        int oCount = map.get('o');
        int nCount = map.get('n');
        while (bCount >= 1 && aCount >= 1 && lCount >= 2 && oCount >= 2 && nCount >= 1) {
            balloonCount++;
            bCount--;
            aCount--;
            lCount -= 2;
            oCount -= 2;
            nCount--;
        }
        return balloonCount;
    }
}
/*
    解题思路：
        0.HashMap计数
 */
/*
    执行用时：11 ms, 在所有 Java 提交中击败了17.06% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了38.84% 的用户
 */