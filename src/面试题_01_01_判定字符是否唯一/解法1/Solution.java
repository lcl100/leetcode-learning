package 面试题_01_01_判定字符是否唯一.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isUnique(String astr) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = astr.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                return false;
            } else {
                map.put(c, 1);
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.用HashMap统计每个字符的出现次数，判断HashMap中是否已经包含该字符，如果是则返回false，如果没有则添加该字符
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了81.37% 的用户
 */