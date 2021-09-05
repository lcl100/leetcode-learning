package 第414题_第三大的数.解法2;

import java.util.TreeMap;

public class Solution {
    public int thirdMax(int[] nums) {
        // 1.将nums中所有元素添加到TreeMap中去重和排序
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }
        // 2.特殊情况判断
        if (map.size() == 1) {
            return map.firstKey();
        }
        if (map.size() == 2) {
            int first = map.pollFirstEntry().getKey();
            int second = map.pollFirstEntry().getKey();
            return Math.max(first, second);
        }
        // 3.取出倒数第三个值
        map.pollLastEntry();
        map.pollLastEntry();
        return map.pollLastEntry().getKey();
    }
}
/*
    解题思路：
        0.TreeMap
        1.利用TreeMap的特性：去重、排序
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了18.76% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了63.26% 的用户
 */
