package 第350题_两个数组的交集II.解法1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = getMap(nums1);
        Map<Integer, Integer> nums2Map = getMap(nums2);
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            int v1 = nums1Map.getOrDefault(num, 0);
            int v2 = nums2Map.getOrDefault(num, 0);
            if (v1 >= 1 && v2 >= 1) {
                list.add(num);
                nums1Map.put(num, v1 - 1);
                nums2Map.put(num, v2 - 1);
            }
        }
        // 2.将List集合中所有元素放到int[]数组中并返回
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // 统计整型数组int[]中个数的出现次数
    private Map<Integer, Integer> getMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.统计两个数组中各数字的出现次数
        2.如果某元素在两个数组中都出现了，那么它的次数一定大于等于1，将该数添加到List集合中
        3.在添加交集元素后，就将两个Map集合中该数的出现次数加1，避免错误判断。
 */
/*
    执行用时：5 ms, 在所有 Java 提交中击败了21.03% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了90.32% 的用户
 */