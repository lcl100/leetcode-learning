package 第1748题_唯一元素的和.解法1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                val++;
                map.put(num, val);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> set = map.keySet();
        Integer sum = 0;
        for (Integer key : set) {
            Integer value = map.get(key);
            if (value == 1) {
                sum += key;
            }
        }
        return sum;
    }
}
/*
    解题思路：
        1.使用HashMap统计每个数的出现次数，键为不重复的数，值为出现次数
        2.计算出现次数为1次的所有数的总和
 */
