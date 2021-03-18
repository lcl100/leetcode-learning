package 面试题17_10_主要元素.解法1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int majorityElement(int[] nums) {
        // 1.将nums数组中的元素放到HashMap中统计出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                value++;
                map.put(num, value);
            } else {
                map.put(num, 1);
            }
        }
        // 2.判断主要元素
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > nums.length/2) {
                return key;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.统计每个数的出现次数
        1.使用HashMap记录每个数的出现次数
 */