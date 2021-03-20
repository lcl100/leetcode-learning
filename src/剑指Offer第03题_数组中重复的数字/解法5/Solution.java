package 剑指Offer第03题_数组中重复的数字.解法5;

import java.util.Arrays;

class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                count++;
                if (count > 1) {
                    return nums[i];
                }
            } else {
                count = 1;
                i = j;
            }
            j++;
        }
        return -1;
    }

}
/*
    解题思路：
        0.统计元素次数
        1.首先将数组排序，便于统计重复元素的出现次数
        2.循环遍历数组，统计每个数的重复次数，然后判断重复次数是否大于1，如果是则返回
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了56.29% 的用户
    内存消耗：46 MB, 在所有 Java 提交中击败了87.40% 的用户
 */