package 剑指Offer第03题_数组中重复的数字.解法2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int findRepeatNumber(int[] nums) {
        // 1.用HashMap统计出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2.返回出现次数大于1的数
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > 1) {
                return key;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap
        1.用HashMap统计每个数的出现次数，最后返回出现次数大于1的数
 */
/*
    执行用时：19 ms, 在所有 Java 提交中击败了5.36% 的用户
    内存消耗：49 MB, 在所有 Java 提交中击败了5.20% 的用户
 */