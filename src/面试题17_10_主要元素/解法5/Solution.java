package 面试题17_10_主要元素.解法5;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int majorityElement(int[] nums) {
        // 将nums数组中的元素去重
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        // 2.双层循环判断每个元素的出现个数并判断是否是主要元素
        for (Integer arr : array) {
            int count = 0;// 局部变量，统计每个数的出现次数
            for (int num : nums) {// 统计该数的出现次数
                if (arr == num) {
                    count++;
                }
            }
            if (count > nums.length / 2) {// 比较该数是否是主要元素
                return arr;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.暴力破解
 */