package 剑指Offer第39题_数组中出现次数超过一半的数字.解法2;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        // 1.将数组排序
        Arrays.sort(nums);
        // 2.数组中出现次数超过一半的数字一定在数组的中间位置
        return nums[nums.length / 2];
    }
}
/*
    解题思路：
        1.将数组排序
        2.数组中出现次数超过一半的数字一定在数组的中间位置
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了60.04% 的用户
    内存消耗：44.8 MB, 在所有 Java 提交中击败了5.05% 的用户
 */