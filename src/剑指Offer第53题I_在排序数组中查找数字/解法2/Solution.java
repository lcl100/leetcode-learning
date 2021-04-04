package 剑指Offer第53题I_在排序数组中查找数字.解法2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.getOrDefault(target, 0);
    }
}
/*
    解题思路：
        0.HashMap计数
        1.使用HashMap统计每个数的出现次数
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了5.04% 的用户
    内存消耗：41.4 MB, 在所有 Java 提交中击败了50.44% 的用户
 */