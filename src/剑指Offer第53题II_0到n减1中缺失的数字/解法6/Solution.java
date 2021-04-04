package 剑指Offer第53题II_0到n减1中缺失的数字.解法6;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 添加nums[i]
            map.put(nums[i], 1);
            // 用nums[i]与i比较
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return nums.length;
    }
}
/*
    0.HashMap
    1.利用HashMap判断是否已有该元素，因为会有一个i在HashMap中不存在
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了6.19% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了5.05% 的用户
 */