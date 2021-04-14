package 剑指Offer第39题_数组中出现次数超过一半的数字.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        // 1.用HashMap统计nums数组中每个数的出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2.最后返回HashMap中出现次数大于nums.length/2的数
        int n = nums.length / 2;
        for (Integer key : map.keySet()) {
            if (map.get(key) > n) {
                return key;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.用HashMap统计nums数组中每个数的出现次数
        2.最后返回HashMap中出现次数大于nums.length/2的数
 */
/*
    执行用时：13 ms, 在所有 Java 提交中击败了26.99% 的用户
    内存消耗：44.2 MB, 在所有 Java 提交中击败了5.05% 的用户
 */