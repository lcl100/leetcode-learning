package 第414题_第三大的数.解法1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int thirdMax(int[] nums) {
        // 1.将nums中所有元素添加到Set集合中，去除重复元素
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        // 将set集合转换成数组
        Integer[] array = set.toArray(new Integer[set.size()]);
        // 特殊情况判断
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        // 2.对数组排序
        Arrays.sort(array);
        // 3.直接返回数组中倒数第三的元素
        return array[array.length - 3];
    }
}
/*
    解题思路：
        0.排序
        1.将数组去重后，排序，最后返回倒数第三个元素即可
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了18.76% 的用户
    内存消耗：38 MB, 在所有 Java 提交中击败了93.05% 的用户
 */