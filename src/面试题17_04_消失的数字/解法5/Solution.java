package 面试题17_04_消失的数字.解法5;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.HashMap
        1.将每个数存放到HashMap中，判断Map是否包含此数
 */