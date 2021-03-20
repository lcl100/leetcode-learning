package 剑指Offer第03题_数组中重复的数字.解法4;

import java.util.Arrays;

class Solution {
    public int findRepeatNumber(int[] nums) {
        // 1.将数组排序
        Arrays.sort(nums);
        // 循环遍历，判断相邻元素是否相等
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.相邻元素是否相等
        1.首先将数组排序，然后比较相邻元素是否相等，如果相等则返回
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了56.29% 的用户
    内存消耗：45.9 MB, 在所有 Java 提交中击败了92.11% 的用户
 */