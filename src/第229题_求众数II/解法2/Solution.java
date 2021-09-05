package 第229题_求众数II.解法2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums.length / 3;
        while (j < nums.length) {
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            if (j < nums.length && nums[j] != nums[i]) {
                if ((j - i) > n) {
                    list.add(nums[i]);
                }
                i = j;
            }
        }
        if (j == nums.length && nums[j - 1] == nums[i] && (j - i) > n) {
            list.add(nums[i]);
        }
        return list;
    }
}
/*
    执行用时：3 ms, 在所有 Java 提交中击败了39.07% 的用户
    内存消耗：42.4 MB, 在所有 Java 提交中击败了44.01% 的用户
 */