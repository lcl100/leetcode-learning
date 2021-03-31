package 第383题_赎金信.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = ransomNote.toCharArray();
        Map<Character, Integer> ransomNoteMap = getMap(ransomNote);
        Map<Character, Integer> magazineMap = getMap(magazine);
        for (char aChar : chars) {
            // 由于magazineMap中可能不存在ransomNote中的字符，所以使用getOrDefault()方法，设置一个默认值
            if (ransomNoteMap.getOrDefault(aChar, 0) > magazineMap.getOrDefault(aChar, 0)) {
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
        1.使用HashMap统计字符串中每个字符的个数
        2.如果ransomNote中某字符的出现次数大于magazine中相同字符的出现次数，那么表示不能构成成功返回false
 */
/*
    执行用时：13 ms, 在所有 Java 提交中击败了26.47% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了10.44% 的用户
 */