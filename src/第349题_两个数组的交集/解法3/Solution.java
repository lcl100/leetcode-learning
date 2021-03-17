package 第349题_两个数组的交集.解法3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    set.add(num1);
                }
            }
        }
        // 将Set集合中的元素放到数组返回
        Integer[] integers = set.toArray(new Integer[set.size()]);
        int[] result = new int[set.size()];
        for (int i = 0; i < integers.length; i++) {
            result[i] = integers[i];
        }
        return result;
    }
}
/*
    解题思路：
        0.暴力破解
        1.双层for循环，判断是否有元素相等，如果相等则添加到Set集合去重
        2.将Set集合中的元素放到数组中返回
 */