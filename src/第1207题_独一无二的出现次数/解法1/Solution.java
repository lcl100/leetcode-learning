package 第1207题_独一无二的出现次数.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 1.用Map统计arr数组中每个数的出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // 2.用另外一个Map统计出现次数的出现次数
        Map<Integer, Integer> keyMap = new HashMap<>();
        for (Integer key : map.keySet()) {
            if (keyMap.containsKey(map.get(key))) {
                return false;
            } else {
                keyMap.put(map.get(key), 1);
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.先用一个HashMap统计每个数的出现次数
        2.再用一个HashMap统计出现次数的出现次数，意思就是看谁的统计次数相同，那么就返回false
            例如：arr = [1,2]
                数字1出现了1次；数字2出现了1次
                出现1次的出现次数总共有2次
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了92.47% 的用户
    内存消耗：36.4 MB, 在所有 Java 提交中击败了49.41% 的用户
 */