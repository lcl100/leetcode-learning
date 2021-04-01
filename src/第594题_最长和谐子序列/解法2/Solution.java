package 第594题_最长和谐子序列.解法2;

import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 0;
        int max = 0;
        // [1,2,2,2,3,3,5,7]
        while (j < nums.length) {
            while (nums[j] - nums[i] > 1) {
                i++;
            }
            if (nums[j] - nums[i] == 1) {
                max = Math.max(max, j - i + 1);
            }
            j++;
        }
        return max;
    }
}
/*
    解题思路：
        0.排序
 */
/*
    执行用时：16 ms, 在所有 Java 提交中击败了92.51% 的用户
    内存消耗：39.4 MB, 在所有 Java 提交中击败了70.42% 的用户
 */