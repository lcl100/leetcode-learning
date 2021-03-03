package 第268题_丢失的数字.解法2;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {

        // 1.排序
        Arrays.sort(nums);

        // 2.比较值
        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length) { // 处理特殊情况如[0]，该返回1
                return nums.length;
            }
            if (nums[i] != i) {// 如果不相等则返回i
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0};
        System.out.println();
        System.out.println(solution.missingNumber(nums));
    }
}
/**
 * 思路：
 * 将数组排序后比较值
 */
