package 第961题_重复N次的元素.解法1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] A) {
        // 1.用HashMap存储每个数的出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        // 2.判断HashMap中哪个数的出现次数为A.length/2
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) == A.length / 2) {
                return key;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.计数
        1.用HashMap存储每个数的出现次数
 */
/*
    执行用时：20 ms, 在所有 Java 提交中击败了20.95% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了90.10% 的用户
 */