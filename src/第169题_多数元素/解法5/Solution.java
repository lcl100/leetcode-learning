package 第169题_多数元素.解法5;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        // 1.对数组排序，让重复元素相邻
        Arrays.sort(nums);
        // 2.用双指针统计每个数的出现次数
        int i = 0, j = 0;
        int n = nums.length / 2;
        while (j < nums.length) {
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            if ((j - i) > n) {
                return nums[i];
            }
            i = j;
        }
        return -1;
    }
}
/*
    解题思路：
        0.双指针计数
        1.将数组排序，排序后数组中重复元素会相邻
        2.用双指针i和j来对每个元素的出现次数进行统计，将i指向数的起始索引，j指向数的结束索引（即下一个数的起始索引），所以该数的出现次数是j-i
        3.只需要判断j-i是否大于nums.length/2就可以了
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了30.17% 的用户
    内存消耗：41.5 MB, 在所有 Java 提交中击败了84.89% 的用户
 */