package 第169题_多数元素.解法4;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        // 1.用HashMap统计每个数的出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2.返回Map中出现次数大于n/2的数
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
        0.HashMap记录出现次数
        1.用HashMap统计每个数的出现次数
        2.最后返回HashMap中出现次数大于n/2的数
 */
/*
    执行用时：15 ms, 在所有 Java 提交中击败了22.02% 的用户
    内存消耗：43.6 MB, 在所有 Java 提交中击败了24.36% 的用户
 */