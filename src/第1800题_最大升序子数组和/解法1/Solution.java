package 第1800题_最大升序子数组和.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxAscendingSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;// 存放每个升序子数组中所有数的总和
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if ((i + 1) < nums.length && nums[i] >= nums[i + 1] || i == nums.length - 1) {
                list.add(sum);
                sum = 0;// 重置sum
            }
        }
        // 找寻list集合中的最大数
        int max = list.get(0);
        for (Integer l : list) {
            if (l > max) {
                max = l;
            }
        }
        return max;
    }
}
/*
    解题思路：
        1.将所有的升序子数组的总和添加到List集合中
        2.然后查找List集合中的最大值
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了7.56% 的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了5.04% 的用户
 */